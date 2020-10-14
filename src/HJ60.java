import java.io.InputStreamReader;
import java.io.BufferedReader;

public class HJ60 {
    public static boolean isZhiShu(int num) {
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bf.readLine()) != null) {
            int num = Integer.parseInt(str.trim());
            for (int m = num / 2; num >= 2; m--) {
                if (isZhiShu(m) && isZhiShu(num - m)) {
                    System.out.println(m);
                    System.out.println(num - m);
                    break;
                }
            }
        }
    }
}