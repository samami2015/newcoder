import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ63 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        while ((in = br.readLine()) != null) {
            int window = Integer.parseInt(br.readLine());
            int num = 0;
            for (int i = 0; i < in.length(); i++) {
                char cur = in.charAt(i);
                if (i == 'G' || i == 'C') num++;
            }
            int max = num;
            int left = 0;
            for (int i = 1; i < in.length() - window; i++) {
                char pre = in.charAt(i - 1);
                char nex = in.charAt(i + window - 1);
                if (pre == 'G' || pre == 'C') num--;
                if (nex == 'G' || nex == 'C') num++;
                if (num > max) {
                    max = num;
                    left = i;
                }
            }
            System.out.println(in.substring(left, left + window));
        }
    }
}