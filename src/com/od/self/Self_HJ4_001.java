package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ4_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            //input = br.readLine();
            if (input.length() == 8) System.out.println(input);
            if (input.length() < 8) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 8 - input.length(); i++) {
                    sb.append("0");
                }
                System.out.println(input + sb);
            }
            if(input.length() > 8){
                System.out.println(input.substring(0,8));
                System.out.println(input.substring(8,input.length()));
            }
        }
    }
}
