package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Self_HJ14_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while((input=br.readLine())!=null){
            int count = Integer.parseInt(input);
            String[] strs = new String[count];
            for(int i=0;i<count;i++){
                strs[i]= br.readLine();
            }
            Arrays.sort(strs);
            StringBuilder sb = new StringBuilder();
            for(String str:strs){
                sb.append(str);
                sb.append("\n");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}
