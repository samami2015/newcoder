import java.util.*;
import java.io.*;

public class HJ17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int x = 0;
            int y = 0;
            String[] ss = str.split(";");
            for (int i = 0; i < ss.length; i++) {
                String s = ss[i];
                //if(s=="") continue;
                //if(s.length()<=1 || s.length()>=3) continue;
                char[] chs = s.toCharArray();
                int move = 0;
                for (int j = 1; j < chs.length; j++) {
                    char c = chs[j];
                    if ('0' <= c && c <= '9') {
                        move = move * 10 + (c - '0');
                    } else {
                        break;
                    }
                }
                switch (chs[0]) {
                    case 'A':
                        x -= move;
                        break;
                    case 'D':
                        x += move;
                        break;
                    case 'W':
                        y += move;
                        break;
                    case 'S':
                        y -= move;
                        break;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}