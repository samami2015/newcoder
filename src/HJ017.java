import java.util.*;
import java.io.*;

/**
 * 【坐标移动】
 * 描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，
 * 并将最终输入结果输出到输出文件里面。
 *
 * 输入：
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * 坐标之间以;分隔。
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 * 下面是一个简单的例子 如：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 处理过程：
 * 起点（0,0）
 * +   A10   =  （-10,0）
 * +   S20   =  (-10,-20)
 * +   W10  =  (-10,-10)
 * +   D30  =  (20,-10)
 * +   x    =  无效
 * +   A1A   =  无效
 * +   B10A11   =  无效
 * +  一个空 不影响
 * +   A10  =  (10,-10)
 * 结果 （10， -10）
 * 注意请处理多组输入输出
 * 输入描述：
 * 一行字符串
 * 输出描述：
 * 最终坐标，以逗号分隔
 * 示例1
 * 输入：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 复制
 * 输出：
 * 10,-10
 */
public class HJ017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int x = 0;
            int y = 0;
            String[] ss = str.split(";");
            for (int i = 0; i < ss.length; i++) {
                String s = ss[i];
                //if(s=="") continue;
                //if(s.length()<=1 || s.length()>=3) continue;
                char[] chs = s.toCharArray();
                int move = 0;
                for (int j = 1; j < chs.length; j++) {
                    char c = chs[j];
                    if ('0' <= c && c <= '9') {
                        move = move * 10 + (c - '0');
                    } else {
                        break;
                    }
                }
                switch (chs[0]) {
                    case 'A':
                        x -= move;
                        break;
                    case 'D':
                        x += move;
                        break;
                    case 'W':
                        y += move;
                        break;
                    case 'S':
                        y -= move;
                        break;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}