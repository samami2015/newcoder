import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = Integer.parseInt(str);
        int[] value = new int[count];
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            String[] r = s.split(" ");
            int key = Integer.parseInt(r[0]);
            value[key] += Integer.parseInt(r[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (value[i] == 0) {
            } else {
                sb.append(i).append(" ").append(value[i]).append(System.lineSeparator());
            }
        }
        System.out.println(sb.toString());
    }
}