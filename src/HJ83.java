import java.io.*;

public class HJ83 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = reader.readLine()) != null) {
            int r = 0;
            int c = 0;
            String[] s = input.split(" ");
            r = Integer.parseInt(s[0]);
            c = Integer.parseInt(s[1]);
            if (c >= 0 && c <= 9 && r >= 0 && r <= 9) System.out.println(0);
            else System.out.println(-1);
            r = Math.min(r, 9);
            c = Math.min(c, 9);
            int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
            s = reader.readLine().split(" ");
            r1 = Integer.parseInt(s[0]);
            c1 = Integer.parseInt(s[1]);
            r2 = Integer.parseInt(s[2]);
            c2 = Integer.parseInt(s[3]);
            if (c1 >= 0 && c1 < c && r1 >= 0 && r1 < r && c2 >= 0 && c2 < c && r2 >= 0 && r2 < r) System.out.println(0);
            else System.out.println(-1);
            int ic = 0;
            int ir = 0;
            ir = Integer.parseInt(reader.readLine());
            ic = Integer.parseInt(reader.readLine());
            if (ir >= 0 && ir < r && (r + 1) <= 9) System.out.println(0);
            else System.out.println(-1);
            if (ic >= 0 && ic < c && (c + 1) <= 9) System.out.println(0);
            else System.out.println(-1);
            int qr = 0, qc = 0;
            s = reader.readLine().split(" ");
            qr = Integer.parseInt(s[0]);
            qc = Integer.parseInt(s[1]);
            if (qr >= 0 && qr < r && qc >= 0 && qc < c) System.out.println(0);
            else System.out.println(-1);
        }
    }
}