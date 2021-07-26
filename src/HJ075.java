import java.io.*;

/**
 * 【公共子串计算】
 * 描述
 * 给定两个只包含小写字母的字符串，计算两个字符串的最大公共子串的长度。
 * 注：子串的定义指一个字符串删掉其部分前缀和后缀（也可以不删）后形成的字符串。
 * 输入描述：
 * 输入两个只包含小写字母的字符串
 * 输出描述：
 * 输出一个整数，代表最大公共子串的长度
 * <p>
 * 示例1
 * 输入：
 * asdfas
 * werasdfaswer
 * 输出：
 * 6
 */
public class HJ075 {
    public static void main(String[] arfs) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = bf.readLine()) != null) {
            String str1 = line + "q";
            String str2 = bf.readLine() + "w";
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            System.out.println(Chazhao(c1, c2));
        }
    }

    public static int Chazhao(char[] c1, char[] c2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < c1.length; i++) {
            int temp1 = i;
            count = 0;
            for (int j = 0; j < c2.length; j++) {
                count = 0;
                int temp2 = j;
                temp1 = i;
                while (c1[temp1] == c2[temp2]) {
                    count++;
                    temp1++;
                    temp2++;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
