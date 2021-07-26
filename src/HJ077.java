import java.util.*;

/**
 * 【火车进站】
 * 描述
 * 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，
 * 同时停靠在火车站的列车中，只有后进站的出站了，先进站的才能出站。
 * 要求输出所有火车出站的方案，以字典序排序输出。
 * 输入描述：
 * 有多组测试用例，每一组第一行输入一个正整数N（0
 * <p>
 * 输出描述：
 * 输出以字典序从小到大排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行，具体见sample。
 * <p>
 * 示例1
 * 输入：
 * 3
 * 1 2 3
 * 输出：
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 2 1
 * 说明：
 * 第一种方案：1进、1出、2进、2出、3进、3出
 * 第二种方案：1进、1出、2进、3进、3出、2出
 * 第三种方案：1进、2进、2出、1出、3进、3出
 * 第四种方案：1进、2进、2出、3进、3出、1出
 * 第五种方案：1进、2进、3进、3出、2出、1出
 * 请注意，[3,1,2]这个序列是不可能实现的。
 */
public class HJ077 {
    private static Stack<String> stack1 = new Stack<String>();
    private static Stack<String> stack2 = new Stack<String>();
    private static List<String> list = new ArrayList<String>();

    public static void ff(String str) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            list.add(str.trim());
            return;
        }
        if (!stack2.isEmpty()) {
            String str1 = stack2.pop();
            ff(str + " " + str1);
            stack2.push(str1);
        }
        if (!stack1.isEmpty()) {
            String str2 = stack1.pop();
            stack2.push(str2);
            ff(str);
            stack2.pop();
            stack1.push(str2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            String[] ss = str.split(" ");
            for (int i = ss.length - 1; i >= 0; i--)
                stack1.push(ss[i]);
            ff("");
            Collections.sort(list);
            for (String s : list)
                System.out.println(s);
        }
    }
}
