package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ21_002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            int[] ans = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                if (65 <= (int) chars[i] && (int) chars[i] <= 90 && chars[i] != 'Z') {
                    ans[i] = Character.toLowerCase(chars[i]) + 1;
                }
                if (chars[i] == 'Z') {
                    ans[i] = 'a';
                }
                if (97 <= (int) chars[i] && (int) chars[i] <= 122) {
                    if (chars[i] == '1') {
                        ans[i] = '1';
                    }
                    if (chars[i] == 'a' || chars[i] == 'b' || chars[i] == 'c') {
                        ans[i] = '2';
                    }
                    if (chars[i] == 'd' || chars[i] == 'e' || chars[i] == 'f') {
                        ans[i] = '3';
                    }
                    if (chars[i] == 'g' || chars[i] == 'h' || chars[i] == 'i') {
                        ans[i] = '4';
                    }
                    if (chars[i] == 'j' || chars[i] == 'k' || chars[i] == 'l') {
                        ans[i] = '5';
                    }
                    if (chars[i] == 'm' || chars[i] == 'n' || chars[i] == 'o') {
                        ans[i] = '6';
                    }
                    if (chars[i] == 'p' || chars[i] == 'q' || chars[i] == 'r'|| chars[i] == 's') {
                        ans[i] = '7';
                    }
                    if (chars[i] == 't' || chars[i] == 'u' || chars[i] == 'v') {
                        ans[i] = '8';
                    }
                    if (chars[i] == 'w' || chars[i] == 'x' || chars[i] == 'y'|| chars[i] == 'z') {
                        ans[i] = '9';
                    }
                    if (chars[i] == '0') {
                        ans[i] = '0';
                    }
                }
                if(48 <= (int) chars[i] && (int) chars[i] <= 57){
                    ans[i] = chars[i];
                }
            }
            for(int c:ans){
                System.out.print((char)c);
            }
        }
    }
}
