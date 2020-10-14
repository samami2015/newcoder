package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ22_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int num = Integer.parseInt(input);
            int ret = getDivideNum(num) + getModeNum(num);
            System.out.println(ret);
        }

    }

    private static int getModeNum(int num) {
        if (num <= 0) return 0;
        int count = num % 3;
        if(num%3==2){count+=1;}
        return count;
    }

    private static int getDivideNum(int num) {
        if (num <= 0) return 0;
        int count = num / 3;
        if (count >= 3) {
            count += getDivideNum(count);
        }
        return count;
    }
}
