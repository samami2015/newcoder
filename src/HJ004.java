import java.io.*;

public class HJ004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() >= 8) {
                System.out.println(sb.substring(0, 8));
                sb.delete(0, 8);
            }
            if (sb.length() < 8 && sb.length() > 0) {
                sb.append("00000000");
                System.out.println(sb.substring(0, 8));
            }
        }
    }
}