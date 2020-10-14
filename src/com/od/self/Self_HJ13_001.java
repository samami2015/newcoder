package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ13_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
            String[] words = input.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i=words.length-1;i>=0;i--){
                sb.append(words[i]+" ");
            }
            sb.deleteCharAt(sb.lastIndexOf(" "));
            System.out.println(sb.toString());
        }
    }
}
