import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 【名字的漂亮度】
 * 描述
 * 给出一个名字，该名字有26个字符组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个不同字母拥有相同的“漂亮度”。字母忽略大小写。
 * 给出多个名字，计算每个名字最大可能的“漂亮度”。
 * <p>
 * 本题含有多组数据。
 * <p>
 * 输入描述：
 * 整数N，后续N个名字
 * <p>
 * 输出描述：
 * 每个名称可能的最大漂亮程度
 * <p>
 * 示例1
 * 输入：
 * 2
 * zhangsan
 * lisi
 * 输出：
 * 192
 * 101
 */
public class HJ045 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                char[] c = s.toCharArray();
                int[] count = new int[150];
                for (int j = 0; j < c.length; j++) {
                    count[c[j]]++;
                }

                Arrays.sort(count);
                int a = 26;
                int sum = 0;
                for (int k = count.length - 1; k >= 0; k--) {
                    if (count[k] == 0) {
                        break;
                    }
                    sum += count[k] * (a--);
                }
                System.out.println(sum);
            }
        }
    }
}