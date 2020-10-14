package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Self_HJ8_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            Map<Integer, Integer> map = new TreeMap<>();
            int sum = 0;
            while (n > 0) {
                String[] nums = br.readLine().split(" ");
                if (!map.containsKey(Integer.parseInt(nums[0]))) {
                    map.put(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
                } else {
                    sum = map.get(Integer.parseInt(nums[0]));
                    map.put(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]) + sum);
                }
                n--;
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
