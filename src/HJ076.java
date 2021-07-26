import java.io.*;

/**
 * 【尼科彻斯定理】
 * 描述
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 * 本题含有多组输入数据。
 * 输入描述：
 * 输入一个int整数
 * 输出描述：
 * 输出分解后的string
 * 示例1
 * 输入：
 * 6
 * 输出：
 * 31+33+35+37+39+41
 */
public class HJ076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            System.out.println(getSequeOddNum(num));
        }
    }

    public static String getSequeOddNum(int m) {
        int[] nums = new int[m];
        nums[0] = m * m - m + 1;
        if (m == 1) {
            return String.valueOf(nums[0]);
        } else {
            for (int i = 1; i < m; i++) {
                nums[i] = nums[i - 1] + 2;
            }
            StringBuffer sb = new StringBuffer();
            sb.append(nums[0]);
            for (int i = 1; i < m; i++) {
                sb.append("+");
                sb.append(nums[i]);
            }
            return sb.toString();
        }
    }
}