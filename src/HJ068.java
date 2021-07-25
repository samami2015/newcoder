import java.io.*;
import java.util.*;

/**
 * 【成绩排序】
 * 描述
 * 查找和排序
 * 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 * 都按先录入排列在前的规则处理。
 * 例示：
 * jack      70
 * peter     96
 * Tom       70
 * smith     67
 * 从高到低  成绩
 * peter     96
 * jack      70
 * Tom       70
 * smith     67
 * 从低到高
 * smith     67
 * jack      70
 * Tom       70
 * peter     96
 * 注：0代表从高到低，1代表从低到高
 * 本题含有多组输入数据！
 * 输入描述：
 * 输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开
 * 输出描述：
 * 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 * 示例1
 * 输入：
 * 3
 * 0
 * fang 90
 * yang 50
 * ning 70
 * 输出：
 * fang 90
 * ning 70
 * yang 50
 * 示例2
 * 输入：
 * 3
 * 1
 * fang 90
 * yang 50
 * ning 70
 * 3
 * 0
 * moolgouua 43
 * aebjag 87
 * b 67
 * 输出：
 * yang 50
 * ning 70
 * fang 90
 * aebjag 87
 * b 67
 * moolgouua 43
 * 说明：
 * 第一组用例:
 * 3
 * 1
 * fang 90
 * yang 50
 * ning 70
 * 升序排序为：
 * yang 50
 * ning 70
 * fang 90
 * 第二组降序为:
 * aebjag 87
 * b 67
 * moolgouua 43
 */
public class HJ068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str.trim());
            int bool = Integer.parseInt(br.readLine().trim());
            String[] name = new String[n];
            int[] score = new int[n];
            for (int i = 0; i < n; i++) {
                str = br.readLine().trim();
                String[] temp = str.split(" ");
                name[i] = temp[0];
                score[i] = Integer.parseInt(temp[1]);
            }
            if (bool == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (score[j + 1] > score[j]) {
                            String na = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = na;
                            int t = score[j];
                            score[j] = score[j + 1];
                            score[j + 1] = t;
                        }
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (score[j + 1] < score[j]) {
                            String na = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = na;
                            int t = score[j];
                            score[j] = score[j + 1];
                            score[j + 1] = t;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(name[i] + " ");
                sb.append(score[i]);
                if (i != (n - 1)) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }
}