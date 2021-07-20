import java.io.*;
import java.util.*;

public class HJ108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] strArr = str.split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int j = m * n;
            if (n > m) {
                int temp = m;
                m = n;
                n = temp;
            }
            //最大公约数
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            int max = j / m;
            System.out.println(max);
        }
    }
}