package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ5_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
            //System.out.println(Long.parseLong(input.substring(2),16));
            System.out.println(Integer.parseInt(input.substring(2),16));
        }
    }
}
