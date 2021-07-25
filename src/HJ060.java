import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * 【查找组成一个偶数最接近的两个素数】
 * 描述
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入一个偶数
 *
 * 输出描述：
 * 输出两个素数
 *
 * 示例1
 * 输入：
 * 20
 * 输出：
 * 7
 * 13
 */
public class HJ060 {
    public static boolean isZhiShu(int num) {
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bf.readLine()) != null) {
            int num = Integer.parseInt(str.trim());
            for (int m = num / 2; num >= 2; m--) {
                if (isZhiShu(m) && isZhiShu(num - m)) {
                    System.out.println(m);
                    System.out.println(num - m);
                    break;
                }
            }
        }
    }
}