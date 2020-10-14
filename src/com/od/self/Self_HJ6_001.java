package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ6_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuffer sb = new StringBuffer();
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sb.append(i + " ");
                    n /= i;
                    i--;
                }
            }
            sb.append(n + " ");
            System.out.println(sb.toString());
        }
    }
}
