import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【字符串最后一个单词的长度】
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
 * <p>
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 * <p>
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 * <p>
 * 示例1
 * 输入：
 * hello nowcoder
 * 输出：
 * 8
 * 说明：
 * 最后一个单词为nowcoder，长度为8
 */
public class HJ001 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String[] parmas;
        while ((input = br.readLine()) != null) {
            parmas = input.split(" ");
            System.out.println(parmas[parmas.length - 1].length());
        }
    }
}