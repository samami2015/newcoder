import java.io.*;
import java.util.*;

/**
 * 【密码截取】
 * 描述
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，
 * 但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。
 * 因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，
 * 他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 *
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入一个字符串
 *
 * 输出描述：
 * 返回有效密码串的最大长度
 *
 * 示例1
 * 输入：
 * ABBA
 * 输出：
 * 4
 */
public class HJ032 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            int max = 0;
            char[] arr = str.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                int left = i - 1;
                int right = i;
                while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
                    if (right - left + 1 > max) {
                        max = right - left + 1;
                    }
                    left--;
                    right++;
                }
                left = i - 1;
                right = i + 1;
                while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
                    if (right - left + 1 > max) {
                        max = right - left + 1;
                    }
                    left--;
                    right++;
                }
            }
            System.out.println(max);
        }
    }
}