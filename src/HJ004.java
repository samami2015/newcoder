import java.io.*;

/**
 * 【字符串分隔】
 * 描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * <p>
 * 输入描述：
 * 连续输入字符串(输入多次,每个字符串长度小于100)
 * <p>
 * 输出描述：
 * 输出到长度为8的新字符串数组
 * <p>
 * 示例1
 * 输入：
 * abc
 * 123456789
 * 输出：
 * abc00000
 * 12345678
 * 90000000
 */
public class HJ004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() >= 8) {
                System.out.println(sb.substring(0, 8));
                sb.delete(0, 8);
            }
            if (sb.length() < 8 && sb.length() > 0) {
                sb.append("00000000");
                System.out.println(sb.substring(0, 8));
            }
        }
    }
}