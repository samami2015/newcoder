import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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