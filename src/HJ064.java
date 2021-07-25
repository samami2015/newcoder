import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【MP3光标位置】
 * 描述
 * MP3 Player因为屏幕较小，显示歌曲列表的时候每屏只能显示几首歌曲，用户要通过上下键才能浏览所有的歌曲。
 * 为了简化处理，假设每屏只能显示4首歌曲，光标初始的位置为第1首歌。
 * 现在要实现通过上下键控制光标移动来浏览歌曲列表，控制逻辑如下：
 * 歌曲总数<=4的时候，不需要翻页，只是挪动光标位置。
 * 光标在第一首歌曲上时，按Up键光标挪到最后一首歌曲；光标在最后一首歌曲时，按Down键光标挪到第一首歌曲。
 *  #1           1           1            #1
 *   2           2           2             2
 *   3  --up-->  3           3  --down-->  3
 *   4          #4          #4             4
 * 其他情况下用户按Up键，光标挪到上一首歌曲；用户按Down键，光标挪到下一首歌曲。
 *   1           1           1             1
 *   2          #2          #2             2
 *  #3  --up-->  3           3  --down--> #3
 *   4          #4           4             4
 * 2. 歌曲总数大于4的时候（以一共有10首歌为例）：
 * 特殊翻页：屏幕显示的是第一页（即显示第1 – 4首）时，光标在第一首歌曲上，用户按Up键后，屏幕要显示最后一页（即显示第7-10首歌），
 * 同时光标放到最后一首歌上。同样的，屏幕显示最后一页时，光标在最后一首歌曲上，用户按Down键，屏幕要显示第一页，光标挪到第一首歌上。
 *  #1           7           7            #1
 *   2           8           8             2
 *   3  --up-->  9           9  --down-->  3
 *   4          #10        #10             4
 * 一般翻页：屏幕显示的不是第一页时，光标在当前屏幕显示的第一首歌曲时，用户按Up键后，屏幕从当前歌曲的上一首开始显示，光标也挪到上一首歌曲。光标当前屏幕的最后一首歌时的Down键处理也类似。
 *  #4          #3           4             5
 *   5           4           5             6
 *   6  --up-->  5           6  --down-->  7
 *   7           6          #7            #8
 * 其他情况，不用翻页，只是挪动光标就行。
 * 输入描述：
 * 输入说明：
 * 1 输入歌曲数量
 * 2 输入命令 U或者D
 *
 * 本题含有多组输入数据！
 * 输出描述：
 * 输出说明
 * 1 输出当前列表
 * 2 输出当前选中歌曲
 *
 * 示例1
 * 输入：
 * 10
 * UUUU
 * 输出：
 * 7 8 9 10
 * 7
 */

public class HJ064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        String str = null;
        while ((str = br.readLine()) != null) {
            String str2 = br.readLine();
            int num = Integer.parseInt(str);
            char[] array = str2.toCharArray();
            int current = 1;
            int start = 1;
            for (char one : array) {
                if (num <= 4) {
                    if (one == 'U') {
                        if (current == 1) {
                            current = num;
                        } else {
                            current--;
                        }
                    } else if (one == 'D') {
                        if (current == num) {
                            current = 1;
                        } else {
                            current++;
                        }
                    }
                }
                if (num > 4) {
                    if (one == 'U') {
                        if (current == 1) {
                            current = num;
                            start = num - 3;
                        } else if (current == start) {
                            current--;
                            start--;
                        } else {
                            current--;
                        }
                    } else if (one == 'D') {
                        if (current == num) {
                            current = 1;
                            start = 1;
                        } else if (current == start + 3) {
                            current++;
                            start++;
                        } else {
                            current++;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 4; i++) {
                if (num >= i) {
                    sb.append(start + i - 1).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
            System.out.println(current);
        }
    }
}