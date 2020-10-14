import java.io.*;
import java.util.*;

public class HJ68 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str.trim());
            int bool = Integer.parseInt(br.readLine().trim());
            String[] name = new String[n];
            int[] score = new int[n];
            for (int i = 0; i < n; i++) {
                str = br.readLine().trim();
                String[] temp = str.split(" ");
                name[i] = temp[0];
                score[i] = Integer.parseInt(temp[1]);
            }
            if (bool == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (score[j + 1] > score[j]) {
                            String na = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = na;
                            int t = score[j];
                            score[j] = score[j + 1];
                            score[j + 1] = t;
                        }
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (score[j + 1] < score[j]) {
                            String na = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = na;
                            int t = score[j];
                            score[j] = score[j + 1];
                            score[j + 1] = t;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(name[i] + " ");
                sb.append(score[i]);
                if (i != (n - 1)) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }
}