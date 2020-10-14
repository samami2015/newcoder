import java.io.*;
import java.util.*;

/*首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。*/
public class HJ97 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            String[] nums = br.readLine().split(" ");
            int negative = 0;
            int positive = 0;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(nums[i]);
                if (num < 0) {
                    negative++;
                } else if (num > 0) {
                    sum += num;
                    positive++;
                }
            }
            System.out.println(negative + " " + Math.round(sum * 10.0 / positive) / 10.0);
        }
    }
}