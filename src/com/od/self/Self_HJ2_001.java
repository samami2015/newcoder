package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ2_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int count = 0;
        while ((input = br.readLine()) != null) {
            char[] chars = input.toCharArray();
            char c = br.readLine().charAt(0);
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == c || chars[i] == c - 32) {
                    count++;
                }
            }
            System.out.println(count);
            //System.out.println('A'+'1');
            count = 0;
        }
    }
}
