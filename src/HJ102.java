import java.io.*;
import java.util.*;

public class HJ102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chArr = str.toCharArray();
            int[] temp = new int[150];
            for (int i = 0; i < chArr.length; i++) {
                temp[chArr[i]]++;
            }
            int max = 0;
            for (int j = 0; j < temp.length; j++) {
                if (max < temp[j]) {
                    max = temp[j];
                }
            }
            StringBuilder sbf = new StringBuilder();
            while (max != 0) {
                for (int j = 0; j < temp.length; j++) {
                    if (temp[j] == max) {
                        sbf.append((char) j);
                    }
                }
                max--;
            }
            System.out.println(sbf.toString());
        }
    }
}