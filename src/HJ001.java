import java.io.InputStream;

public class HJ001 {
    public static void main(String[] args) throws Exception {
        int times = 0;
        InputStream in = System.in;
        char c = (char) in.read();
        while (c != '\n') {
            if (c == ' ') {
                times = 0;
            } else {
                times += 1;
            }
            c = (char) in.read();
        }
        System.out.println(times);
    }
}