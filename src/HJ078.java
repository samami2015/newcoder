import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        while ((str1 = br.readLine()) != null) {
            String str2 = br.readLine();
            StringBuilder sb1 = new StringBuilder(str1);
            StringBuilder sb2 = new StringBuilder(str2);
            if (str1.length() > str2.length()) {
                for (int i = 0; i < str1.length() - str2.length(); i++) {
                    sb2.insert(0, '0');
                }
            } else {
                for (int i = 0; i < str2.length() - str1.length(); i++) {
                    sb1.insert(0, '0');
                }
            }
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            for (int i = sb1.length() - 1; i >= 0; i--) {
                int m = sb1.charAt(i) - '0';
                int n = sb2.charAt(i) - '0';
                int sum = m + n + temp;
                sb.insert(0, sum % 10);
                temp = sum / 10;
            }
            if (temp != 0) {
                sb.insert(0, temp);
            }
            System.out.println(sb.toString());
        }
    }
}