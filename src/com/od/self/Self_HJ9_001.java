package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ9_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            String str = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                if (!str.contains(chars[i] + "")) {
                    str += chars[i];
                }
            }
            System.out.println(str);
        }
    }
}