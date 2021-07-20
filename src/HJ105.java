import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class HJ105 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nNum = 0;
        int pNum = 0;
        int pSum = 0;
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.valueOf(str);
            if (n >= 0) {
                pNum++;
                pSum += n;
            } else {
                nNum++;
            }
        }
        System.out.println(nNum);
        System.out.println(Math.round(pSum * 10.0 / pNum) / 10.0);
    }
}