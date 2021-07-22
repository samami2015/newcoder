import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【统计字符】
 * 描述
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 * 本题包含多组输入。
 * 输入描述：
 * 输入一行字符串，可以有空格
 * 输出描述：
 * 统计其中英文字符，空格字符，数字字符，其他字符的个数
 *
 * 示例1
 * 输入：
 * 1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
 * 输出：
 * 26
 * 3
 * 10
 * 12
 */
public class HJ040 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int EnglishCharCount = 0;
            int BlankCharCount = 0;
            int NumberCharCount = 0;
            int OtherCharCount = 0;
            char[] chs = line.toCharArray();
            for (int i = 0; i < chs.length; ++i) {
                if ((chs[i] >= 'a' && chs[i] <= 'z') || (chs[i] >= 'A' && chs[i] <= 'Z')) {
                    ++EnglishCharCount;
                    continue;
                } else if (chs[i] == ' ') {
                    ++BlankCharCount;
                    continue;
                } else if (chs[i] >= '0' && chs[i] <= '9') {
                    ++NumberCharCount;
                    continue;
                } else
                    ++OtherCharCount;
            }
            System.out.println(EnglishCharCount);
            System.out.println(BlankCharCount);
            System.out.println(NumberCharCount);
            System.out.println(OtherCharCount);
        }
    }
}