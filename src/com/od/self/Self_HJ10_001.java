package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Self_HJ10_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=br.readLine())!=null){
            char[] chars = input.toCharArray();
            Set<Character> set = new HashSet<Character>();
            for (int i=0;i<chars.length;i++){
                set.add(chars[i]);
            }
            System.out.println(set.size());
        }

    }
}
