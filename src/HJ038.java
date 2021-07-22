import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【求小球落地5次后所经历的路程和第5次反弹的高度】
 * 描述
 * 假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
 * 最后的误差判断是小数点6位
 * <p>
 * 输入描述：
 * 输入起始高度，int型
 * <p>
 * 输出描述：
 * 分别输出第5次落地时，共经过多少米第5次反弹多高
 * <p>
 * 示例1
 * 输入：
 * 1
 * 输出：
 * 2.875
 * 0.03125
 */
public class HJ038 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            double height = Integer.parseInt(str);
            System.out.println(get(height));
            System.out.println(height(height));
        }
    }

    public static double height(double h) {
        for (int i = 0; i < 5; i++) {
            h = h / 2;
        }
        return h;
    }

    public static double get(double h) {
        return h + h + h / 2 + h / 4 + h / 8;
    }
}