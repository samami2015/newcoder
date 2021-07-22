import java.io.*;

/**
 * 【蛇形矩阵】
 * 描述
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 * 例如，当输入5时，应该输出的三角形为：
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 * <p>
 * 请注意本题含有多组样例输入。
 * <p>
 * 输入描述：
 * 输入正整数N（N不大于100）
 * <p>
 * 输出描述：
 * 输出一个N行的蛇形矩阵。
 * 示例1
 * 输入：
 * 4
 * 输出：
 * 1 3 6 10
 * 2 5 9
 * 4 8
 * 7
 */
public class HJ035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                int start = (i - 1) * i / 2 + 1;
                int step = i + 1;
                for (int j = 1; j <= num - i + 1; j++) {
                    sb.append(start).append(" ");
                    start += step;
                    step++;
                }
                sb.setCharAt(sb.length() - 1, '\n');
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}