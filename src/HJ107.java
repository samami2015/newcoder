import java.io.*;

/**
 * 【求解立方根】
 * 描述
 * 计算一个数字的立方根，不使用库函数。
 * 保留一位小数。
 * 输入描述：
 * 待求解参数，为double类型（一个实数）
 * 输出描述：
 * 输入参数的立方根。保留一位小数。
 * 示例1
 * 输入：
 * 216
 * 复制
 * 输出：
 * 6.0
 */
public class HJ107 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        double d1 = Double.parseDouble(str);
        System.out.println(method1(d1));
    }

    public static double method1(double d1) {
        double x = 1;
        double x0 = x - (x * x * x - d1) / (3 * x * x);
        while (x - x0 > 0.000000001 || x - x0 < -0.000000001) {
            x = x0;
            x0 = x - (x * x * x - d1) / (3 * x * x);
        }
        return (double) Math.round(x0 * 10.0) / 10.0;
    }
}