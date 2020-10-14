import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ38 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            double height = Integer.parseInt(str);
            System.out.println(get(height));
            System.out.println(height(height));
        }
    }

    public static double height(double h) {
        for (int i = 0; i < 5; i++) {
            h = h / 2;
        }
        return h;
    }

    public static double get(double h) {
        return h + h + h / 2 + h / 4 + h / 8;
    }
}