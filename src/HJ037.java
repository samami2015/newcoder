import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ037 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int monthCount = Integer.parseInt(line);
            System.out.println(getTotalCount(monthCount));
        }
    }

    public static int getTotalCount(int monthCount) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 2; i < monthCount; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
