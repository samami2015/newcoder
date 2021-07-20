/**
 * @FileName: Test
 * @Author: KipFcrs
 * @Date: 2020/8/3 16:27
 */

import java.util.*;
import java.io.*;

public class HJ101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputCount;

        while ((inputCount = br.readLine()) != null) {
            int count = Integer.parseInt(inputCount);
            String[] input = br.readLine().split(" ");
            int flag = Integer.parseInt(br.readLine());
            int[] num = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                num[i] = Integer.parseInt(input[i]);
            }
            quickSort(num, 0, num.length - 1);
            StringBuilder sb = new StringBuilder();
            if (flag == 0) {
                for (int j = 0; j < num.length; j++) {
                    sb.append(num[j]).append(" ");
                }
            } else {
                for (int k = num.length - 1; k >= 0; k--) {
                    sb.append(num[k]).append(" ");
                }
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }

    }

    public static void quickSort(int[] num, int L, int R) {
        if (L >= R) {
            return;
        }
        int p = partition(num, L, R);
        quickSort(num, L, p - 1);
        quickSort(num, p + 1, R);
    }

    public static int partition(int[] num, int L, int R) {
        int key = num[L];
        int pivot = L;

        for (int i = L + 1; i <= R; i++) {
            if (num[i] < key) {
                int temp = num[++pivot];
                num[pivot] = num[i];
                num[i] = temp;
            }
        }
        int tt = num[pivot];
        num[pivot] = num[L];
        num[L] = tt;
        return pivot;
    }

}
