import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 【删除字符串中出现次数最少的字符】
 * 描述
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * 输入描述：
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 * <p>
 * 输出描述：
 * 删除字符串中出现次数最少的字符后的字符串。
 * <p>
 * 示例1
 * 输入：
 * abcdd
 * aabcddd
 * 复制
 * 输出：
 * dd
 * aaddd
 */
public class HJ023 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        //HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while (null != (str = reader.readLine())) {
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            }
            int min = Integer.MAX_VALUE;
            for (Character key : map.keySet()) {
                if (min > map.get(key)) {
                    min = map.get(key);//最小的次数
                }
            }
            StringBuilder res = new StringBuilder();
            for (Character c : array) {
                if (min != map.get(c)) {
                    res.append(c);
                }
            }
            System.out.println(res.toString());
            res.delete(0, res.length() - 1);
            map.clear();
        }
    }
}
