import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【整数与IP地址间的转换】
 * 描述
 * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 * 一个长整数。
 * 举例：一个ip地址为10.0.3.193
 * 每段数字             相对应的二进制数
 * 10                   00001010
 * 0                    00000000
 * 3                    00000011
 * 193                  11000001
 * 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
 * 本题含有多组输入用例，每组用例需要你将一个ip地址转换为整数、将一个整数转换为ip地址。
 * 输入描述：
 * 输入
 * 1 输入IP地址
 * 2 输入10进制型的IP地址
 * <p>
 * 输出描述：
 * 输出
 * 1 输出转换成10进制的IP地址
 * 2 输出转换后的IP地址
 * <p>
 * 示例1
 * 输入：
 * 10.0.3.193
 * 167969729
 * 输出：
 * 167773121
 * 10.3.3.193
 */
public class HJ033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            String[] ip = str.split("\\.");
            long num = Long.parseLong(br.readLine());
            //转10进制
            System.out.println(Long.parseLong(ip[0]) << 24 | Long.parseLong(ip[1]) << 16 |
                    Long.parseLong(ip[2]) << 8 | Long.parseLong(ip[3]));
            //转ip地址
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf((num >> 24) & 255)).append(".").append(String.valueOf((num >> 16) & 255))
                    .append(".").append(String.valueOf((num >> 8) & 255)).append(".").append(String.valueOf(num & 255));
            System.out.println(sb.toString());
        }
    }
}
