import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (null != (str = br.readLine())) {
            char[] strs = str.toCharArray();
            StringBuilder result = new StringBuilder();
            int i = 0;
            while (i < strs.length) {
                if ('0' <= strs[i] && strs[i] <= '9') {
                    result.append("*");
                    result.append(strs[i]);
                    while (++i < strs.length && '0' <= strs[i] && strs[i] <= '9') {
                        result.append(strs[i]);
                    }
                    result.append("*");
                } else {
                    result.append(strs[i]);
                    i++;
                }
            }
            System.out.println(result.toString().trim());
        }
    }
}
