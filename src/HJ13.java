import java.util.*;
import java.io.*;

public class HJ13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            int n = str.length();
            char[] chars = str.toCharArray();
            int i = 0, j = 0;
            while (j <= n) {
                if (j == n || chars[j] == ' ') {
                    reverse(chars, i, j - 1);
                    i = j + 1;
                }
                j++;
            }
            reverse(chars, 0, n - 1);
            System.out.println(new String(chars));
        }
    }

    public static void reverse(char[] chars, int i, int j) {
        while (i < j) {
            swap(chars, i++, j--);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}