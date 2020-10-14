import java.io.*;

public class HJ84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            int num = 0;
            for (char c : line.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}