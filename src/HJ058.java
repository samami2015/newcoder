import java.io.*;
import java.util.*;

/**
 * 【输入n个整数，输出其中最小的k个】
 * 描述
 * 输入n个整数，输出其中最小的k个。
 * 本题有多组输入样例，请使用循环读入，比如while(cin>>)等方式处理
 * 输入描述：
 * 第一行输入两个整数n和k
 * 第二行输入一个整数数组
 * 输出描述：
 * 输出一个从小到大排序的整数数组
 * 示例1
 * 输入：
 * 5 2
 * 1 3 5 7 2
 * 输出：
 * 1 2
 */
public class HJ058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            if (str.equals("")) continue;
            String[] params = str.split(" ");
            int n = Integer.parseInt(params[0]), k = Integer.parseInt(params[1]);
            int[] res = new int[n];
            int start = 0, index = 0;
            if (params.length > 2) start = 2;
            else params = br.readLine().split(" ");
            for (int i = start; i < params.length; i++) {
                res[index++] = Integer.parseInt(params[i]);
            }
            Arrays.sort(res);
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < k; i++) ans.append(res[i]).append(" ");
            System.out.println(ans.toString().trim());
        }
    }
}