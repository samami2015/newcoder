import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 【字符串通配符】
 * 描述
 * 问题描述：在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
 * 要求：
 * 实现如下2个通配符：
 * *：匹配0个或以上的字符（字符由英文字母和数字0-9组成，下同）
 * ？：匹配1个字符
 * 注意：匹配时不区分大小写。
 * 输入：
 * 通配符表达式；
 * 一组字符串。
 * 输出：
 * 返回不区分大小写的匹配结果，匹配成功输出true，匹配失败输出false
 * 本题含有多组样例输入！
 * 输入描述：
 * 先输入一个带有通配符的字符串，再输入一个需要匹配的字符串
 * 输出描述：
 * 返回不区分大小写的匹配结果，匹配成功输出true，匹配失败输出false
 * 示例1
 * 输入：
 * te?t*.*
 * txt12.xls
 * 输出：
 * false
 * 示例2
 * 输入：
 * z
 * zz
 * 输出：
 * false
 * 示例3
 * 输入：
 * pq
 * pppq
 * 输出：
 * false
 * 示例4
 * 输入：
 * **Z
 * 0QZz
 * 输出：
 * true
 * 示例5
 * 输入：
 * ?*Bc*?
 * abcd
 * 输出：
 * true
 * 示例6
 * 输入：
 * p*p*qp**pq*p**p***ppq
 * pppppppqppqqppqppppqqqppqppqpqqqppqpqpppqpppqpqqqpqqp
 * 输出：
 * false
 */
public class HJ071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            String s2 = br.readLine();
            System.out.println(help(s2, line));
        }
    }

    public static boolean help(String s, String p) {
        int sr = 0;
        int pr = 0;
        int st = -1;
        int match = 0;
        while (sr < s.length()) {
            if (pr < p.length() && (s.charAt(sr) == p.charAt(pr) || p.charAt(pr) == '?')) {
                pr++;
                sr++;
            } else if (pr < p.length() && p.charAt(pr) == '*') {
                st = pr;
                match = sr;
                pr++;
            } else if (st != -1) {
                pr = st + 1;
                sr = ++match;
            } else {
                return false;
            }
        }
        while (pr < p.length() && p.charAt(pr) == '*') {
            pr++;
        }
        return pr == p.length();
    }
}