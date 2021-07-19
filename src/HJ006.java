import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

/**
 * 【质数因子】
 * 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * 最后一个数后面也要有空格
 * <p>
 * 输入描述：
 * 输入一个long型整数
 * <p>
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * 示例1
 * 输入：
 * 180
 * 输出：
 * 2 2 3 3 5
 */
public class HJ006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            int sum = Integer.parseInt(str);
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    sb.append(i).append(" ");
                    sum /= i;
                    i--;
                }
            }
            sb.append(sum).append(" ");
            System.out.println(sb.toString());
        }
    }
}
