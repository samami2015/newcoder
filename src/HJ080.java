import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 【整型数组合并】
 * 描述
 * 题目标题：
 * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
 * 输出时相邻两数之间没有空格。
 * 请注意本题有多组样例。
 * 输入描述：
 * 输入说明，按下列顺序输入：
 * 1 输入第一个数组的个数
 * 2 输入第一个数组的数值
 * 3 输入第二个数组的个数
 * 4 输入第二个数组的数值
 * 输出描述：
 * 输出合并之后的数组
 * 示例1
 * 输入：
 * 3
 * 1 2 5
 * 4
 * -1 0 3 2
 * 输出：
 * -101235
 */
public class HJ080 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && line.length() > 0) {
            String[] strs = br.readLine().split(" ");
            int[] array1 = new int[strs.length];
            for (int i = 0; i < array1.length; ++i)
                array1[i] = Integer.parseInt(strs[i]);
            line = br.readLine();
            strs = br.readLine().split(" ");
            int[] array2 = new int[strs.length];
            for (int i = 0; i < array2.length; ++i)
                array2[i] = Integer.parseInt(strs[i]);
            System.out.println(combineBySort(array1, array2));
        }
    }

    static String combineBySort(int[] array1, int[] array2) {
        int[] outPut = new int[array1.length + array2.length];
        Arrays.sort(array1);
        Arrays.sort(array2);
        int M = array1.length, R = array2.length;
        int idx = 0, i = 0, j = 0;
        if (array1[i] > array2[j]) {
            outPut[idx++] = array2[j++];
        } else if (array1[i] < array2[j]) {
            outPut[idx++] = array1[i++];
        } else {
            outPut[idx++] = array1[i++];
            j++;
        }
        while (i < M && j < R) {
            if (array1[i] > array2[j]) {
                if (outPut[idx - 1] != array2[j])
                    outPut[idx++] = array2[j];
                ++j;
            } else if (array1[i] < array2[j]) {
                if (outPut[idx - 1] != array1[i])
                    outPut[idx++] = array1[i];
                ++i;
            } else {
                if (outPut[idx - 1] != array1[i])
                    outPut[idx++] = array1[i];
                ++i;
                ++j;
            }
        }
        if (i == M) {
            while (j < R) {
                if (outPut[idx - 1] != array2[j])//去重
                    outPut[idx++] = array2[j];
                j++;
            }
        } else {
            for (; i < M; ++i)
                if (outPut[idx - 1] != array1[i])
                    outPut[idx++] = array1[i];
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < idx; ++i)
            sb.append(outPut[i]);
        return sb.toString();
    }
}