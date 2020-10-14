import java.io.*;

public class HJ12 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int len;
        byte[] b = new byte[1024];
        while ((len = in.read(b)) > 0) {
            String str = new String(b, 0, len - 1);
            char[] chars = str.toCharArray();
            char[] charsFb = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                charsFb[i] = chars[chars.length - 1 - i];
            }
            System.out.println(new String(charsFb));
        }
    }
}