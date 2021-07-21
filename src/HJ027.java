import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 【查找兄弟单词】
 * 描述
 * 定义一个单词的“兄弟单词”为：交换该单词字母顺序（注：可以交换任意次），而不添加、删除、修改原有的字母就能生成的单词。
 * 兄弟单词要求和原来的单词不同。例如：ab和ba是兄弟单词。ab和ab则不是兄弟单词。
 * 现在给定你n个单词，另外再给你一个单词str，让你寻找str的兄弟单词里，按字典序排列后的第k个单词是什么？
 * 注意：字典中可能有重复单词。本题含有多组输入数据。
 * 输入描述：
 * 先输入单词的个数n，再输入n个单词。 再输入一个单词，为待查找的单词x 最后输入数字k
 * 输出描述：
 * 输出查找到x的兄弟单词的个数m 然后输出查找到的按照字典顺序排序后的第k个兄弟单词，没有符合第k个的话则不用输出。
 * 示例1
 * 输入：
 * 3 abc bca cab abc 1
 * 复制
 * 输出：
 * 2
 * bca
 * 示例2
 * 输入：
 * 6 cab ad abcd cba abc bca abc 1
 * 输出：
 * 3
 * bca
 * 说明：
 * abc的兄弟单词有cab cba bca，所以输出3
 * 经字典序排列后，变为bca cab cba，所以第1个字典序兄弟单词为bca
 */
public class HJ027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = br.readLine()) != null) {
            String[] arr = input.trim().split(" ");
            Integer n = Integer.parseInt(arr[0]);
            /*if (n > 1000) {
                break;
            }*/
            String target = arr[arr.length - 2];
            Integer num = Integer.parseInt(arr[arr.length - 1]); //要展示的数据量
            String[] dic = new String[n];
            //将字典项放入数组
            for (int i = 1; i <= n; i++) {
                dic[i - 1] = arr[i];
            }
            int count = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < dic.length; i++) {
                if ((dic[i].length() != target.length()) || (dic[i].equals(target))) {
                    continue;
                }
                char[] chars = dic[i].toCharArray();
                char[] targetArr = target.toCharArray();
                int tmp = 0;
                for (int j = 0; j < chars.length; j++) {
                    for (int k = 0; k < targetArr.length; k++) {
                        if (chars[j] == targetArr[k]) {
                            targetArr[k] = '0';
                            tmp++;
                            break;
                        }
                    }
                }
                if (tmp == targetArr.length) { //都删除完毕证明，字符匹配
                    count++;
                    list.add(dic[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if (list.size() >= num) {
                System.out.println(list.get(num - 1));
            }
        }
    }
}
