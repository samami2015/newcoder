import java.io.*;

public class HJ48 {
    //构建节点
    public static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            if (str.equals("")) continue;
            String[] params = str.split(" ");//str.split(" ")将字符串按空格分开并返回为字符串数组的形式
            int n = Integer.parseInt(params[0]);
            Node head = new Node(Integer.parseInt(params[1]));//将字符串数字默认转换为整型的十进制数，使用的是Integer类
            for (int i = 1; i < n; i++) {
                int pre = Integer.parseInt(params[2 * i + 1]), nxt = Integer.parseInt(params[2 * i]);
                Node temp = head;
                while (temp.val != pre) temp = temp.next;//遍历插入点的位置
                Node node = new Node(nxt);
                node.next = temp.next;
                temp.next = node;
            }
            int del = Integer.parseInt(params[2 * n]);
            StringBuilder ans = new StringBuilder();//StringBuilder类可以更改字符串，不会占用多余的空间，始终是一个数组
            Node temp = head;
            while (temp != null) {
                if (temp.val != del) ans.append(temp.val).append(" ");//append为StringBuilder类中添加字符串的方法
                temp = temp.next;
            }
            // 注意要求每个数后面都加空格
            System.out.println(ans.toString());//转换为字符串格式
        }
    }
}
