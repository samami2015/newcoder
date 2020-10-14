import java.util.*;
import java.io.*;

public class HJ34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine()) != null) {
            char[] result = s.toCharArray();
            Arrays.sort(result);
            System.out.println(String.valueOf(result));
        }
    }
}