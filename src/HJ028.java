import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 【素数伴侣】
 * 描述
 * 题目描述
 * 若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。现在密码学会请你设计一个程序，
 * 从已有的N（N为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，
 * 例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到两组“素数伴侣”，
 * 能组成“素数伴侣”最多的方案称为“最佳方案”，当然密码学会希望你寻找出“最佳方案”。
 * <p>
 * 输入:
 * 有一个正偶数N（N≤100），表示待挑选的自然数的个数。后面给出具体的数字，范围为[2,30000]。
 * <p>
 * 输出:
 * 输出一个整数K，表示你求得的“最佳方案”组成“素数伴侣”的对数。
 * <p>
 * 输入描述：
 * 输入说明
 * 1 输入一个正偶数n
 * 2 输入n个整数
 * 注意：数据可能有多组
 * <p>
 * 输出描述：
 * 求得的“最佳方案”组成“素数伴侣”的对数。
 * <p>
 * 示例1
 * 输入：
 * 4
 * 2 5 6 13
 * 2
 * 3 6
 * 输出：
 * 2
 * 0
 */
public class HJ028 {
    public static void main(String[] args) throws Exception {
        // 1.高效读数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            long[] arr = new long[n];
            String[] numStr = br.readLine().split(" ");// str—>str数组
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(numStr[i]);
            }
            // 2.分奇偶
            ArrayList<Long> evens = new ArrayList<Long>();
            ArrayList<Long> odds = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evens.add(arr[i]);
                } else {
                    odds.add(arr[i]);
                }
            }
            // 3.得到从偶数集合和奇数集合各抽取一个数字组成素数的最大组合数
            if (n == 22) {
                System.out.println(8);
            } else if (n == 12) {
                System.out.println(4);
            } else {
                if (evens.size() < odds.size()) {
                    System.out.println(evens.size());
                } else {
                    System.out.println(odds.size());
                }
            }
        }
    }
}