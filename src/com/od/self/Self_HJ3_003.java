package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ3_003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input= br.readLine())!=null){
            int[] students = new int[1001];
            StringBuffer sb = new StringBuffer();
            int n = Integer.parseInt(input);
            for(int i=0;i<n;i++){
                students[Integer.parseInt(br.readLine())] = 1;
            }
            for(int i=0;i<1001;i++){
                if(students[i]==1){
                    sb.append(i).append("\n");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
