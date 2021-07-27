import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【求最大连续bit数】
 * 描述
 * 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入一个byte数字
 * 输出描述：
 * 输出转成二进制之后连续1的个数
 * 示例1
 * 输入：
 * 3
 * 5
 * 输出：
 * 2
 * 1
 * 说明：
 * 3的二进制表示是11，最多有2个连续的1。
 * 5的二进制表示是101，最多只有1个连续的1。
 */
public class HJ086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bReader.readLine()) != null) {
            int number = Integer.parseInt(input);
            String binaryString = Integer.toBinaryString(number);
            String[] string = binaryString.split("0");
            int num = 0;
            for (String str : string) {
                num = Math.max(num, str.length());
            }
            System.out.println(num);
        }
    }
}