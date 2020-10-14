import java.io.*;
import java.util.*;

public class HJ90 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bf.readLine()) != null) {
            String[] subIP = str.split("\\.");
            for (int i = 0; i < subIP.length; i++) {
                Integer intIP = Integer.valueOf(subIP[i]);
                if (intIP >= 0 && intIP <= 255) {
                    if (i == subIP.length - 1) {
                        System.out.println("YES");
                    }
                    continue;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}