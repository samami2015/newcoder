import java.io.IOException;

public class HJ106 {
    public static void main(String[] args) throws IOException {
        int length = System.in.available();
        if (length > 2) {
            byte[] bts = new byte[length - 1];
            int flag = System.in.read(bts);
            if (flag != -1) {
                byte[] tmp = new byte[bts.length];
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = bts[tmp.length - i - 1];
                }
                System.out.println(new String(tmp));
            }
        }
    }
}
