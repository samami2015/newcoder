import java.util.*;
import java.io.*;

public class HJ081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String str2 = "";
        while ((str = br.readLine()) != null && !"".equals(str)) {
            str2 = br.readLine();
            char[] arr = str.toCharArray();
            boolean judge = true;
            for (char c : arr) {
                if (!str2.contains(String.valueOf(c))) {
                    judge = false;
                    break;
                }
            }
            System.out.println(judge);
        }
        br.close();
    }
}