import java.io.InputStream;

public class HJ15{
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = stream.read(b)) > 0) {
            if (len == 1) break;
            String s = new String(b, 0, len - 1);
            int n = Integer.parseInt(s);
            int count = numberOfOne(n);
            System.out.println(count);
        }
    }

    private static int numberOfOne(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}