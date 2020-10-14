import java.util.*;
import java.io.*;

public class HJ41 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = bf.readLine()) != null) {
            int n = Integer.parseInt(str);
            String[] s1 = bf.readLine().split(" ");
            String[] s2 = bf.readLine().split(" ");
            int[] weight = new int[s1.length];
            int[] nums = new int[s2.length];
            for (int i = 0; i < n; i++) {
                weight[i] = Integer.parseInt(s1[i]);
                nums[i] = Integer.parseInt(s2[i]);
            }
            System.out.println(fama(n, weight, nums));
        }
    }

    private static int fama(int n, int[] weight, int[] nums) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i] * weight[i];
        }
        boolean[] weg = new boolean[sum + 1];
        weg[0] = true;
        weg[sum] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums[i]; j++) {
                for (int k = sum; k >= weight[i]; k--) {
                    if (weg[k - weight[i]]) {
                        weg[k] = true;
                    }
                }
            }
        }
        int count = 0;
        for (boolean b : weg) {
            if (b) count++;
        }
        return count;
    }
}