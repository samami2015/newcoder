import java.io.*;

/**
 * 【计算字符串的距离】
 * 描述
 * Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。许可的编辑操作包括将一个字符替换成另一个字符，
 * 插入一个字符，删除一个字符。编辑距离的算法是首先由俄国科学家Levenshtein提出的，故又叫Levenshtein Distance。
 * Ex：
 * 字符串A:abcdefg
 * 字符串B: abcdef
 * 通过增加或是删掉字符”g”的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
 * 要求：
 * 给定任意两个字符串，写出一个算法计算它们的编辑距离。
 * 本题含有多组输入数据。
 * 输入描述：
 * 每组用例一共2行，为输入的两个字符串
 * 输出描述：
 * 每组用例输出一行，代表字符串的距离
 * 示例1
 * 输入：
 * abcdefg
 * abcdef
 * abcde
 * abcdf
 * abcde
 * bcdef
 * 复制
 * 输出：
 * 1
 * 1
 * 2
 */
public class HJ052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        while ((str1 = br.readLine()) != null) {
            String str2 = br.readLine();
            System.out.println(stringDistance(str1.toCharArray(), str2.toCharArray()));
        }
    }

    private static int stringDistance(char[] a, char[] b) {
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
        return len[a.length][b.length];
    }
}