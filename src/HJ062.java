import java.io.*;

/**
 * 【查找输入整数二进制中1的个数】
 * 描述
 * 输入一个正整数，计算它在二进制下的1的个数。
 * 注意多组输入输出！！！！！！
 * 输入描述：
 * 输入一个整数
 * 输出描述：
 * 计算整数二进制中1的个数
 * 示例1
 * 输入：
 * 5
 * 输出：
 * 2
 * 说明：
 * 5的二进制表示是101，有2个1
 */
public class HJ062 {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            Integer num = Integer.parseInt(str);
            String s = Integer.toBinaryString(num);
            int x = 0;
            for (char c : s.toCharArray()) {
                if (c == '1')
                    x++;
            }
            System.out.println(x);
        }
    }
}