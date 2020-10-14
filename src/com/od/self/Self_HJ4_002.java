package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ4_002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
            StringBuilder sb = new StringBuilder(input);
            //sb.append(input);
            while (sb.length()>=8){
                System.out.println(sb.substring(0,8));
                sb.delete(0,8);
            }
            if(sb.length()<8 && sb.length()>0){
                sb.append("00000000");
                //sb.delete(0,8);
                System.out.println(sb.substring(0,8));
            }
        }
    }
}
