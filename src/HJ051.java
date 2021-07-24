import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【输出单向链表中倒数第k个结点】
 * 描述
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 * 链表结点定义如下：
 * struct ListNode
 * {
 * int       m_nKey;
 * ListNode* m_pNext;
 * };
 * 正常返回倒数第k个结点指针，异常返回空指针
 * 本题有多组样例输入。
 * 输入描述：
 * 输入说明
 * 1 输入链表结点个数
 * 2 输入链表的值
 * 3 输入k的值
 * 输出描述：
 * 输出一个整数
 * 示例1
 * 输入：
 * 8
 * 1 2 3 4 5 6 7 8
 * 4
 * 输出：
 * 5
 */
public class HJ051 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = br.readLine()) != null) {
            //候选人数
            int num = Integer.parseInt(input);
            String[] numStr = br.readLine().split(" ");
            int num2 = Integer.parseInt(br.readLine().trim());
            if (num2 <= 0 || num2 > numStr.length) {
                System.out.println(num2);
            } else {
                System.out.println(numStr[numStr.length - num2]);
            }
        }
    }
}