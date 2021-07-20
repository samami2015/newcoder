import java.io.*;
import java.util.*;

/**
 * 【简单错误记录】
 * 描述
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * 处理：
 * 1、 记录最多8条错误记录，循环记录，最后只用输出最后出现的八条错误记录。对相同的错误记录只记录一条，但是错误计数增加。
 * 最后一个斜杠后面的带后缀名的部分（保留最后16位）和行号完全匹配的记录才做算是”相同“的错误记录。
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 * 4、循环记录时，只以第一次出现的顺序为准，后面重复的不会更新它的出现时间，仍以第一次为准
 * <p>
 * 输入描述：
 * 每组只包含一个测试用例。一个测试用例包含一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 * <p>
 * 输出描述：
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
 * <p>
 * 示例1
 * 输入：
 * D:\zwtymj\xccb\ljj\cqzlyaszjvlsjmkwoqijggmybr 645
 * E:\je\rzuwnjvnuz 633
 * C:\km\tgjwpb\gy\atl 637
 * F:\weioj\hadd\connsh\rwyfvzsopsuiqjnr 647
 * E:\ns\mfwj\wqkoki\eez 648
 * D:\cfmwafhhgeyawnool 649
 * E:\czt\opwip\osnll\c 637
 * G:\nt\f 633
 * F:\fop\ywzqaop 631
 * F:\yay\jc\ywzqaop 631
 * 输出：
 * rzuwnjvnuz 633 1
 * atl 637 1
 * rwyfvzsopsuiqjnr 647 1
 * eez 648 1
 * fmwafhhgeyawnool 649 1
 * c 637 1
 * f 633 1
 * ywzqaop 631 2
 */
public class HJ019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");
            String str1 = arr[0];
            String str2 = arr[1];
            str1 = str1.substring(str1.lastIndexOf("\\") + 1);
            if (str1.length() > 16) str1 = str1.substring(str1.length() - 16);
            String str12 = str1 + " " + str2;
            map.put(str12, map.getOrDefault(str12, 0) + 1);
            int count = 0;
        }
        int count = 0;
        for (String key : map.keySet()) {
            count++;
            if (count > (map.size() - 8)) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}