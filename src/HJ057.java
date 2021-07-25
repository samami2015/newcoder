import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【高精度整数加法】
 * 描述
 * 输入两个用字符串表示的整数，求它们所表示的数之和。
 * 字符串的长度不超过10000。
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入两个字符串。保证字符串只含有'0'~'9'字符
 * 输出描述：
 * 输出求和后的结果
 * 示例1
 * 输入：
 * 9876543210
 * 1234567890
 * 输出：
 * 11111111100
 */
public class HJ057 {
    public static String bigNumberSum(String bigNumberA, String bigNumberB) {
        int maxLength = Math.max(bigNumberA.length(), bigNumberB.length());
        int[] arrayA = new int[maxLength + 1];
        for (int i = 0; i < bigNumberA.length(); i++) {
            arrayA[i] = bigNumberA.charAt(bigNumberA.length() - 1 - i) - '0';
        }
        int[] arrayB = new int[maxLength + 1];
        for (int i = 0; i < bigNumberB.length(); i++) {
            arrayB[i] = bigNumberB.charAt(bigNumberB.length() - 1 - i) - '0';
        }

        int[] result = new int[maxLength + 1];
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            temp += arrayA[i];
            temp += arrayB[i];
            if (temp >= 10) {
                temp = temp - 10;
                result[i + 1] = 1;
            }
            result[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        boolean findFirst = false;
        for (int i = result.length - 1; i >= 0; i--) {
            if (!findFirst) {
                if (result[i] == 0) {
                    continue;
                }
                findFirst = true;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && line.length() > 0) {
            System.out.println(bigNumberSum(line.trim(), br.readLine().trim()));
        }
    }
}