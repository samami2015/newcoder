import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 【取近似值】
 * 描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * <p>
 * 输入描述：
 * 输入一个正浮点数值
 * <p>
 * 输出描述：
 * 输出该数值的近似整数值
 * <p>
 * 示例1
 * 输入：
 * 5.5
 * 输出：
 * 6
 */
public class HJ007 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int number1 = 0;
        int number2 = 0;
        while ((input = br.readLine()) != null) {
            String[] numbers = input.split("\\.");
            number2 = Integer.parseInt(numbers[1].substring(0, 1));
            if (number2 >= 5) {
                number1 = Integer.parseInt(numbers[0]) + 1;
            }
            if (number2 < 5) {
                number1 = Integer.parseInt(numbers[0]);
            }
            System.out.println(number1);
        }
    }
}
