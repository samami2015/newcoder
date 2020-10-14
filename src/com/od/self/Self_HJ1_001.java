package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ1_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String[] parmas;
        while ((input = br.readLine()) != null) {
            parmas = input.split(" ");
/*            for(int i=0;i<parmas.length;i++){
                System.out.println(parmas[i]);
            }*/
            //System.out.println(parmas[parmas.length-1]);
            System.out.println(parmas[parmas.length-1].length());
        }
    }
}
