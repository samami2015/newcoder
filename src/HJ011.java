import java.io.InputStream;

public class HJ011 {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        int l;
        byte[] bytes = new byte[1024];
        while ((l = stream.read(bytes)) > 0) {
            String numStr = new String(bytes, 0, l - 1);
            char[] numChars = numStr.toCharArray();
            char[] numCharsConvert = new char[numChars.length];
            for (int i = 0; i < numChars.length; i++) {
                numCharsConvert[i] = numChars[numChars.length - 1 - i];
            }
            String str = new String(numCharsConvert);
            System.out.println(str);
        }
    }
}
