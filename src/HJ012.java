import java.io.*;

/**
 * 【字符串反转】
 * 描述
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 * <p>
 * 输入描述：
 * 输入一行，为一个只包含小写字母的字符串。
 * <p>
 * 输出描述：
 * 输出该字符串反转后的字符串。
 * <p>
 * 示例1
 * 输入：
 * abcd
 * 输出：
 * dcba
 */
public class HJ012 {
    public static void main(String[] args) throws IOException {
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