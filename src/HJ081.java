import java.util.*;
import java.io.*;

/**
 * 【字符串字符匹配】
 * 描述
 * 判断短字符串中的所有字符是否在长字符串中全部出现。
 * 请注意本题有多组样例输入。
 * 输入描述：
 * 输入两个字符串。第一个为短字符串，第二个为长字符串。两个字符串均由小写字母组成。
 * 输出描述：
 * 如果短字符串的所有字符均在长字符串中出现过，则输出true。否则输出false。
 * 示例1
 * 输入：
 * bc
 * abc
 * 输出：
 * true
 */
public class HJ081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String str2 = "";
        while ((str = br.readLine()) != null && !"".equals(str)) {
            str2 = br.readLine();
            char[] arr = str.toCharArray();
            boolean judge = true;
            for (char c : arr) {
                if (!str2.contains(String.valueOf(c))) {
                    judge = false;
                    break;
                }
            }
            System.out.println(judge);
        }
        br.close();
    }
}