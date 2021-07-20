import java.io.InputStream;

/**
 * 【求int型正整数在内存中存储时1的个数】
 * 描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * <p>
 * 输入描述：
 * 输入一个整数（int类型）
 * <p>
 * 输出描述：
 * 这个数转换成2进制后，输出1的个数
 * <p>
 * 示例1
 * 输入：
 * 5
 * 输出：
 * 2
 */
public class HJ015 {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = stream.read(b)) > 0) {
            if (len == 1) break;
            String s = new String(b, 0, len - 1);
            int n = Integer.parseInt(s);
            int count = numberOfOne(n);
            System.out.println(count);
        }
    }

    private static int numberOfOne(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}