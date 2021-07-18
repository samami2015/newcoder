import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ040 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int EnglishCharCount = 0;
            int BlankCharCount = 0;
            int NumberCharCount = 0;
            int OtherCharCount = 0;
            char[] chs = line.toCharArray();
            for (int i = 0; i < chs.length; ++i) {
                if ((chs[i] >= 'a' && chs[i] <= 'z') || (chs[i] >= 'A' && chs[i] <= 'Z')) {
                    ++EnglishCharCount;
                    continue;
                } else if (chs[i] == ' ') {
                    ++BlankCharCount;
                    continue;
                } else if (chs[i] >= '0' && chs[i] <= '9') {
                    ++NumberCharCount;
                    continue;
                } else
                    ++OtherCharCount;
            }
            System.out.println(EnglishCharCount);
            System.out.println(BlankCharCount);
            System.out.println(NumberCharCount);
            System.out.println(OtherCharCount);
        }
    }
}