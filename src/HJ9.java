import java.util.*;
import java.io.*;
import java.util.Collections;

public class HJ9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine()) != null) {
            //char[] arr=input.toCharyArray();
            char[] arr = input.toCharArray();
            StringBuffer str = new StringBuffer();
            int[] afs = new int[10];
            for (int i = arr.length - 1; i >= 0; i--) {
                if (afs[arr[i] - '0'] != 0) {
                } else {
                    str.append(arr[i]);
                    afs[arr[i] - '0']++;
                }
            }
            System.out.println(str.toString());
        }
    }
}