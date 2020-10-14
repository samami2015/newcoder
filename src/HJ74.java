import java.util.*;
import java.io.*;

public class HJ74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str != null) {
            String[] output = str.split(" ");
            System.out.println(output.length);
            for (int i = 0; i <= output.length - 1; i++) {
                System.out.println(output[i]);
            }
        }
    }
}