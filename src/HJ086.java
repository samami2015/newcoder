import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bReader.readLine()) != null) {
            int number = Integer.parseInt(input);
            String binaryString = Integer.toBinaryString(number);
            String[] string = binaryString.split("0");
            int num = 0;
            for (String str : string) {
                num = Math.max(num, str.length());
            }
            System.out.println(num);
        }
    }
}