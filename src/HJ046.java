import java.io.*;

/**
 * 【截取字符串】
 * 描述
 * 输入一个字符串和一个整数k，截取字符串的前k个字符并输出
 * 本题输入含有多组数据
 * 输入描述：
 * 1.输入待截取的字符串
 * 2.输入一个正整数k，代表截取的长度
 *
 * 输出描述：
 * 截取后的字符串
 *
 * 示例1
 * 输入：
 * abABCcDEF
 * 6
 * 输出：
 * abABCc
 * 示例2
 * 输入：
 * ffIKEHauv
 * 1
 * bdxPKBhih
 * 6
 * 输出：
 * f
 * bdxPKB
 */
public class HJ046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] s = str.split(" ");
            int num = Integer.parseInt(s[1]);
            int count = 0;
            for (int i = 0; i < s[0].length(); i++) {
                char c = s[0].charAt(i);
                if (c < 128) {
                    count++;
                } else {
                    count += 2;
                }
                if (count == num) {
                    System.out.println(s[0].substring(0, i + 1));
                    break;
                } else if (count > num) {
                    System.out.println(s[0].substring(0, i));
                    break;
                }
            }
        }
    }
}