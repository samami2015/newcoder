import java.io.IOException;

/**
 * 【字符逆序】
 * 描述
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 输入描述：
 * 输入一个字符串，可以有空格
 * 输出描述：
 * 输出逆序的字符串
 * 示例1
 * 输入：
 * I am a student
 * 输出：
 * tneduts a ma I
 */
public class HJ106 {
    public static void main(String[] args) throws IOException {
        int length = System.in.available();
        if (length > 2) {
            byte[] bts = new byte[length - 1];
            int flag = System.in.read(bts);
            if (flag != -1) {
                byte[] tmp = new byte[bts.length];
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = bts[tmp.length - i - 1];
                }
                System.out.println(new String(tmp));
            }
        }
    }
}
