import java.io.InputStream;

public class HJ7 {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        int l;
        byte[] bytes = new byte[1024];
        while ((l = stream.read(bytes)) > 0) {
            if (l == 1) break;
            String d = new String(bytes, 0, l - 1);
            float len = Float.valueOf(d);
            System.out.println(Math.round(len));
        }
    }
}
