import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【最长回文子串】
 * 描述
 * 给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
 * 所谓回文串，指左右对称的字符串。
 * 所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串
 * （注意：记得加上while处理多个测试用例）
 * 输入描述：
 * 输入一个仅包含小写字母的字符串
 * 输出描述：
 * 返回最长回文子串的长度
 * 示例1
 * 输入：
 * cdabbacc
 * 输出：
 * 4
 * 说明：
 * abba为最长的回文子串
 */
public class HJ085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        jiequ(s);
    }

    private static void jiequ(String s) {
        // TODO Auto-generated method stub
        if (s.length() <= 1) {
            System.out.println(s.length());
        }
        char[] ch = s.toCharArray();
        if (s.length() == 2) {
            if (ch[0] == ch[1]) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
        int max1 = 1;
        //奇数
        for (int cur = 1; cur < s.length() - 1; cur++) {
            int length = 1;
            int left = cur - 1;
            int right = cur + 1;
            while (left >= 0 && right < s.length() && ch[left] == ch[right]) {
                length += 2;
                left--;
                right++;
                max1 = Math.max(max1, length);
            }
        }
        int max2 = 1;
        //偶数
        for (int cur1 = 1; cur1 < s.length() - 1; cur1++) {
            int cur2 = cur1 + 1;
            int left = cur1 - 1;
            int right = cur2 + 1;
            if (ch[cur1] == ch[cur2]) {
                int length = 2;
                while (left >= 0 && right < s.length() && ch[left] == ch[right]) {
                    length += 2;
                    left--;
                    right++;
                    max2 = Math.max(max2, length);
                }
            }
        }
        System.out.println(Math.max(max1, max2));
    }
}