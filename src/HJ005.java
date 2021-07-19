import java.util.*;
import java.io.*;

/**
 * 【进制转换】
 * 描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * <p>
 * 输入描述：
 * 输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。
 * <p>
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 * 示例1
 * 输入：
 * 0xA
 * 0xAA
 * 输出：
 * 10
 * 170
 */
public class HJ005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
            //System.out.println(Long.parseLong(input.substring(2),16));
            System.out.println(Integer.parseInt(input.substring(2),16));
        }
    }
}