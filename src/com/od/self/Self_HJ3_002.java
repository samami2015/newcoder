package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Self_HJ3_002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String[] params;
        int[] nums;
        Set<Integer> set = new HashSet<>();
        while((input=br.readLine())!=null){
            params = input.split(" ");
            int n = Integer.parseInt(params[0]);
            nums = new int[n];
            for(int i=1;i<params.length;i++){
                nums[i-1] = Integer.parseInt(params[i]);
                set.add(nums[i-1]);
            }

            //Arrays.sort(nums);
            for(int i:set){
                System.out.println(i);
            }
        }
    }
}
