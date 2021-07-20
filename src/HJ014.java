import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 【字符串排序】
 * 描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述：
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
 * 输入：
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * 输出：
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 */
public class HJ014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            Integer count = Integer.parseInt(str);
            String[] strings = new String[count];
            for (int i = 0; i < count; i++) {
                String str2 = br.readLine();
                strings[i] = str2;
            }
            Arrays.sort(strings);
            StringBuffer stringBuffer = new StringBuffer();
            for (String string : strings) {
                stringBuffer.append(string);
                stringBuffer.append("\n");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println(stringBuffer.toString());
        }
    }
}