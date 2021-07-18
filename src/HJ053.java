import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ053 {
    //  iNOC产品部-杨辉三角的变形
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(getResult(line));
        }
    }

    public static int getResult(String str) {
        int i = Integer.valueOf(str);
        if (i <= 2) {
            return -1;
        } else if (i % 2 == 1) {
            return 2;
        } else {
            if (i % 4 == 0) {
                return 3;
            } else {
                return 4;
            }
        }
    }
}
