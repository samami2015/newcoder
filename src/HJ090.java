import java.io.*;
import java.util.*;

/**
 * 【合法IP】
 * 描述
 * 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），
 * 如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
 * 现在需要你用程序来判断IP是否合法。
 * 注意本题有多组样例输入。
 * 输入描述：
 * 输入一个ip地址，保证是xx.xx.xx.xx的形式（xx为整数）
 * 输出描述：
 * 返回判断的结果YES or NO
 * 示例1
 * 输入：
 * 10.138.15.1
 * 255.0.0.255
 * 255.255.255.1000
 * 输出：
 * YES
 * YES
 * NO
 */
public class HJ090 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bf.readLine()) != null) {
            String[] subIP = str.split("\\.");
            for (int i = 0; i < subIP.length; i++) {
                Integer intIP = Integer.valueOf(subIP[i]);
                if (intIP >= 0 && intIP <= 255) {
                    if (i == subIP.length - 1) {
                        System.out.println("YES");
                    }
                    continue;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}