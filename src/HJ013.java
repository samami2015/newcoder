import java.util.*;
import java.io.*;

/**
 * 【句子逆序】
 * 描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * <p>
 * 输入描述：
 * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 * <p>
 * 输出描述：
 * 得到逆序的句子
 * <p>
 * 示例1
 * 输入：
 * I am a boy
 * 复制
 * 输出：
 * boy a am I
 */
public class HJ013 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            String[] words = input.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i] + " ");
            }
            sb.deleteCharAt(sb.lastIndexOf(" "));
            System.out.println(sb.toString());
        }
    }
}