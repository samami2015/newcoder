import java.io.*;

/**
 * 【统计大写字母个数】
 * 描述
 * 找出给定字符串中大写字符(即'A'-'Z')的个数。
 * 输入描述：
 * 本题含有多组样例输入
 * 对于每组样例，输入一行，代表待统计的字符串
 * 输出描述：
 * 对于每组样例，输出一个整数，代表字符串中大写字母的个数
 * 示例1
 * 输入：
 * add123#$%#%#O
 * 150175017(&^%&$vabovbao
 * 输出：
 * 1
 * 0
 */
public class HJ084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            int num = 0;
            for (char c : line.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}