import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ51 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = br.readLine()) != null) {
            //候选人数
            int num = Integer.parseInt(input);
            String[] numStr = br.readLine().split(" ");
            int num2 = Integer.parseInt(br.readLine().trim());
            if (num2 <= 0 || num2 > numStr.length) {
                System.out.println(num2);
            } else {
                System.out.println(numStr[numStr.length - num2]);
            }
        }
    }
}