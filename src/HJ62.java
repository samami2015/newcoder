import java.io.*;

public class HJ62 {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            Integer num = Integer.parseInt(str);
            String s = Integer.toBinaryString(num);
            int x = 0;
            for (char c : s.toCharArray()) {
                if (c == '1')
                    x++;
            }
            System.out.println(x);
        }
    }
}