package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ17_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            String[] actions = input.split(";");
            int x = 0, y = 0;
            for (int i = 0; i < actions.length; i++) {
                int num = 0;
                if (actions[i].length() == 3) {
                    //num = Integer.parseInt(actions[i].substring(1, 3));
                    char[] chars = actions[i].toCharArray();
                    if (chars.length > 3) {
                        break;
                    }
                    for (int j = 1; j < chars.length; j++) {
                        char c = chars[j];
                        if ('0' <= c && c <= '9') {
                            num = num * 10 + (c - '0');
                        } else {
                            break;
                        }
                    }
                }
                if (actions[i].length() == 3 && num >= -99 && num <= 99) {
                    if (actions[i].charAt(0) == 'A') {
                        x = x - num;
                    }
                    if (actions[i].charAt(0) == 'S') {
                        y = y - num;
                    }
                    if (actions[i].charAt(0) == 'W') {
                        y = y + num;
                    }
                    if (actions[i].charAt(0) == 'D') {
                        x = x + num;
                    }
                } else {

                }
            }
            System.out.println(x + "," + y);
        }
    }
}
