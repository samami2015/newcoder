import java.io.*;

/**
 * 【完全数计算】
 * 描述
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。s
 * 输入n，请输出n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 * 本题输入含有多组样例。
 *
 * 输入描述：
 * 输入一个数字n
 * 输出描述：
 * 输出不超过n的完全数的个数
 *
 * 示例1
 * 输入：
 * 1000
 * 7
 * 100
 * 输出：
 * 3
 * 1
 * 2
 */

public class HJ056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            System.out.println(count(Integer.valueOf(str)));
        }
    }

    public static int count2(int n) {
        if (n < 6) {
            return 0;
        } else if (n < 28) {
            return 1;
        } else if (n < 496) {
            return 2;
        } else if (n < 8128) {
            return 3;
        } else if (n < 33550336) {
            return 4;
        } else {
            return -1;
        }
    }

    public static int count(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                result++;
            }
        }
        return result;
    }
}
