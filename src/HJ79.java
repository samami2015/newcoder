import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 计算两个字符串的距离 = 由一个字符串转换成另一个字符串所需的最少编辑操作次数。
 * 许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。
 *
 * @author chronos
 */
public class HJ79 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = read.readLine()) != null) {
            String str2 = read.readLine();
            System.out.println("1/" + stringDistance(input, str2));
        }
    }

    public static int stringDistance(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int[][] len = new int[a.length + 1][b.length + 1];
        for (int i = 0; i < a.length + 1; i++) {
            len[i][0] = i;
        }
        for (int j = 0; j < b.length + 1; j++) {
            len[0][j] = j;
        }
        for (int i = 1; i < a.length + 1; i++) {
            for (int j = 1; j < b.length + 1; j++) {
                if (a[i - 1] == b[j - 1]) {
                    len[i][j] = len[i - 1][j - 1];
                } else {
                    len[i][j] = Math.min(Math.min(len[i - 1][j], len[i - 1][j - 1]), len[i][j - 1]) + 1;
                }
            }
        }
        return len[a.length][b.length] + 1;
    }
}