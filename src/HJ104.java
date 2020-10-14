import java.util.*;
import java.io.*;

public class HJ104 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufrd = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bufrd.readLine()) != null) {
            int count = Integer.parseInt(input);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < count; i++) {
                input = bufrd.readLine();
                int start = 0;
                int end = 8;
                if (input.length() <= 8) {
                    result.append(input);
                    for (int k = 0; k < 8 - input.length(); k++) {
                        result.append("0");
                    }
                    result.append("\n");

                } else {
                    int cnt = 0;
                    if (input.length() % 8 > 0) {
                        cnt = (input.length() / 8) + 1;
                    } else {
                        cnt = input.length() / 8;
                    }
                    for (int j = 0; j < cnt; j++) {
                        if (end > input.length()) {
                            end = input.length();
                        }
                        String temp = input.substring(start, end);
                        result.append(temp);

                        if (temp.length() < 8) ;
                        for (int k = 0; k < 8 - temp.length(); k++) {
                            result.append("0");
                        }

                        result.append("\n");
                        start += 8;
                        end += 8;
                    }
                }
            }
            System.out.println(result.toString().trim());
        }
    }
}