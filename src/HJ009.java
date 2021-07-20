import java.util.*;
import java.io.*;
import java.util.Collections;

/**
 * 【提取不重复的整数】
 * 描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 * 输入描述：
 * 输入一个int型整数
 * <p>
 * 输出描述：
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * <p>
 * 示例1
 * 输入：
 * 9876673
 * 输出：
 * 37689
 */
public class HJ009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            String str = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                if (!str.contains(chars[i] + "")) {
                    str += chars[i];
                }
            }
            System.out.println(str);
        }
    }
}