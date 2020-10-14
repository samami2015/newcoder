import java.io.*;
import java.util.*;

public class HJ103 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = read.readLine()) != null) {
            int num = Integer.parseInt(input);
            String[] strs = read.readLine().split(" ");
            int[] nums = new int[num];
            int max = 0;
            for (int i = 0; i < strs.length; i++) {
                nums[i] = Integer.parseInt(strs[i]);
            }
            int[] result = new int[num];
            for (int i = 0; i < nums.length; i++) {
                result[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                        result[i] = Math.max(result[i], result[j] + 1);
                    }
                }
            }
            max = 1;
            for (int i = 0; i < result.length; i++) {
                if (result[i] > max) {
                    max = result[i];
                }
            }
            System.out.println(max);
        }
    }
}