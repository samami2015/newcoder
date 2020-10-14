import java.io.*;

public class HJ100 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            System.out.println((3 * n * n + n) / 2);
        }
    }
}