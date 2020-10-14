package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Self_HJ3_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String[] params;

        String[] numbers;
        while((input=br.readLine())!=null){
            params = input.split(" ");
            int n = Integer.parseInt(params[0]);
            int[] nums = new int[n];
            String m = params[1];
            numbers = m.split(",");
            for(int i=0;i<numbers.length;i++){
                nums[i] = Integer.parseInt(numbers[i]);
            }
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++) {
                System.out.println(nums[i]);
            }
        }
    }
}
