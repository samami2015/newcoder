import java.util.*;
import java.io.*;

/**
 * 【字符个数统计】
 * 描述
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ASCII码范围内(0~127，包括0和127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 * 输入描述：
 * 输入一行没有空格的字符串。
 * <p>
 * 输出描述：
 * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
 * <p>
 * 示例1
 * 输入：
 * abc
 * 输出：
 * 3
 */
public class HJ010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < chars.length; i++) {
                set.add(chars[i]);
            }
            System.out.println(set.size());
        }
    }
}