package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ20_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuffer sb = new StringBuffer();
        while ((input = br.readLine()) != null) {
            boolean[] flag = new boolean[4];
            int length = input.length();
            if (length < 9) {
                sb.append("NG").append("\n");
                continue;
            }
            char[] chars = input.toCharArray();
            for (char ch : chars) {
                if ('A' <= ch && ch <= 'Z') {
                    flag[0] = true;
                } else if ('a' <= ch && ch <= 'z') {
                    flag[1] = true;
                } else if ('0' <= ch && ch <= '9') {
                    flag[2] = true;
                } else {
                    flag[3] = true;
                }
            }
            int count = 0;
            for (boolean f : flag) {
                if (f) {
                    count++;
                }
            }
            boolean sign = true;
            for (int i = 0; i < chars.length - 5; i++) {
                for (int j = i + 3; j < chars.length - 2; j++) {
                    if (chars[i] == chars[j] && chars[i + 1] == chars[j + 1] && chars[i + 2] == chars[j + 2]) {
                        sign = false;
                    }
                }
            }
            if (count >= 3 && sign) {
                sb.append("OK").append("\n");
            } else {
                sb.append("NG").append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
