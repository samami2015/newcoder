import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【找出字符串中第一个只出现一次的字符】
 * 描述
 * 找出字符串中第一个只出现一次的字符
 * 输入描述：
 * 输入几个非空字符串
 * 输出描述：
 * 输出第一个只出现一次的字符，如果不存在输出-1
 * <p>
 * 示例1
 * 输入：
 * asdfasdfo
 * aabb
 * 输出：
 * o
 * -1
 */
public class HJ059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (input.indexOf(c) == input.lastIndexOf(c)) {
                    System.out.println(c);
                    break;
                }
                if (i == input.length() - 1) {
                    System.out.println(-1);
                }
            }
        }
    }
}
