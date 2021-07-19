import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【计算字符个数】
 * 描述
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写，字符串长度小于500。
 * <p>
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
 * <p>
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。
 * <p>
 * 示例1
 * 输入：
 * ABCabc
 * A
 * 输出：
 * 2
 */
public class HJ002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bReader.readLine()) != null) {
            char s = bReader.readLine().toCharArray()[0];
            int total = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == s || line.charAt(i) == (char) s - 32) {
                    total++;
                }
            }
            System.out.println(total);
        }
    }
}
