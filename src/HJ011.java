import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【数字颠倒】
 * 描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * <p>
 * <p>
 * 输入描述：
 * 输入一个int整数
 * <p>
 * 输出描述：
 * 将这个整数以字符串的形式逆序输出
 * <p>
 * 示例1
 * 输入：
 * 1516000
 * 输出：
 * 0006151
 */
public class HJ011 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
