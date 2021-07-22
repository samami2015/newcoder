import java.io.*;

/**
 * 【单词倒排】
 * 描述
 * 对字符串中的所有单词进行倒排。
 * 说明：
 * 1、构成单词的字符只有26个大写或小写英文字母；
 * 2、非构成单词的字符均视为单词间隔符；
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * 4、每个单词最长20个字母；
 * 输入描述：
 * 输入一行以空格来分隔的句子
 * 输出描述：
 * 输出句子的逆序
 * 示例1
 * 输入：
 * I am a student
 * 复制
 * 输出：
 * student a am I
 * 复制
 * 示例2
 * 输入：
 * $bo*y gi!r#l
 * 复制
 * 输出：
 * l r gi y bo
 */
public class HJ031 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && line.length() > 0) {
            char[] array = line.trim().toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            int mark = -1;
            for (int i = array.length - 1; i >= 0; i--) {
                if ((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z')) {
                    if (mark == -1)
                        mark = i;
                    flag = true;
                } else if (flag) {
                    sb.append(array, i + 1, mark - i).append(' ');
                    mark = -1;
                    flag = false;
                }
            }
            if (flag) {
                sb.append(array, 0, mark + 1);
                System.out.println(sb.toString());
            } else {
                System.out.println(sb.substring(0, sb.length() - 1));
            }
        }
    }
}