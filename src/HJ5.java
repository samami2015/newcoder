import java.util.*;
import java.io.*;

public class HJ5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine()) != null) {
            String temp = input.substring(2, input.length());
            int sum = 0;
            int length = temp.length();
            for (int i = length - 1; i >= 0; i--) {
                char c = temp.charAt(i);
                int tempNum = (int) c;
                if (tempNum >= 65) {
                    tempNum = tempNum - 65 + 10;
                } else {
                    tempNum = tempNum - 48;
                }
                sum = sum + (int) Math.pow(16, length - i - 1) * tempNum;
            }
            System.out.println(sum);
        }
    }
}