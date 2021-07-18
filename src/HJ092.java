import java.io.*;
import java.util.*;
import java.lang.*;

public class HJ092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            char[] ch = s.toCharArray();
            int max = Integer.MIN_VALUE;
            char[] temp = new char[ch.length];
            int y = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= '0' && ch[i] <= '9') {
                    int count = 1;
                    for (int j = i + 1; j < ch.length; j++, i++) {
                        if (ch[j] >= '0' && ch[j] <= '9') {
                            count++;
                        } else {
                            break;
                        }
                    }
                    if (count > max) {
                        int x = 0;
                        max = count;
                        for (int k = i + 1 - max; k <= i; k++) {
                            temp[x++] = ch[k];
                            y = x;
                        }
                    } else if (count == max) {
                        for (int k = i + 1 - max; k <= i; k++) {
                            temp[y++] = ch[k];
                        }
                    }
                }
            }
            if (y == 0) {
                System.out.println(null + "," + 0);
            } else {
                for (int z = 0; z < y - 1; z++) {
                    System.out.print(temp[z]);
                }
                System.out.println(temp[y - 1] + "," + max);
            }
        }
    }
}