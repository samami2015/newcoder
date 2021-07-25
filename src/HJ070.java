import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 【矩阵乘法计算量估算】
 * 描述
 * 矩阵乘法的运算量与矩阵乘法的顺序强相关。
 * 例如：
 * A是一个50×10的矩阵，B是10×20的矩阵，C是20×5的矩阵
 * 计算A*B*C有两种顺序：（（AB）C）或者（A（BC）），前者需要计算15000次乘法，后者只需要3500次。
 * 编写程序计算不同的计算顺序需要进行的乘法次数。
 * 本题含有多组样例输入！
 * 输入描述：
 * 输入多行，先输入要计算乘法的矩阵个数n，每个矩阵的行数，列数，总共2n的数，最后输入要计算的法则
 * 计算的法则为一个字符串，仅由左右括号和大写字母（'A'~'Z'）组成，保证括号是匹配的且输入合法！
 *
 * 输出描述：
 * 输出需要进行的乘法次数
 *
 * 示例1
 * 输入：
 * 3
 * 50 10
 * 10 20
 * 20 5
 * (A(BC))
 * 输出：
 * 3500
 */
public class HJ070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        String str = null;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            int[][] arr = new int[num][2];
            for (int i = 0; i < num; i++) {
                String[] sa = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(sa[0]);
                arr[i][1] = Integer.parseInt(sa[1]);
            }
            int n = arr.length - 1;
            char[] ca = br.readLine().toCharArray();
            Stack<Integer> stack = new Stack<>();
            int sum = 0;
            for (int i = ca.length - 1; i >= 0; i--) {
                char one = ca[i];
                if (one == ')') {
                    stack.push(-1);
                } else if (one == '(') {
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    sum += arr[n1][0] * arr[n2][0] * arr[n2][1];
                    arr[n1][1] = arr[n2][1];
                    stack.pop();
                    stack.push(n1);
                } else {
                    stack.push(n);
                    n--;
                }
            }
            System.out.println(sum);
        }
    }
}