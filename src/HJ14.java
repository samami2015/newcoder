import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class HJ14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            Integer count = Integer.parseInt(str);
            String[] strings = new String[count];
            for (int i = 0; i < count; i++) {
                String str2 = br.readLine();
                strings[i] = str2;
            }
            Arrays.sort(strings);
            StringBuffer stringBuffer = new StringBuffer();
            for (String string : strings) {
                stringBuffer.append(string);
                stringBuffer.append("\n");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println(stringBuffer.toString());
        }
    }
}