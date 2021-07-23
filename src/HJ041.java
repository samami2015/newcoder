import java.util.*;
import java.io.*;

/**
 * 【称砝码】
 * 描述
 * 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
 * 每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 * 注：
 * 称重重量包括0
 * 输入描述：
 * 输入包含多组测试数据。
 * 对于每组测试数据：
 * 第一行：n --- 砝码数(范围[1,10])
 * 第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])
 * 第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])
 * 输出描述：
 * 利用给定的砝码可以称出的不同的重量数
 * <p>
 * 示例1
 * 输入：
 * 2
 * 1 2
 * 2 1
 * 输出：
 * 5
 */
public class HJ041 {
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