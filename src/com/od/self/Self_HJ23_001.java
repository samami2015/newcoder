package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Self_HJ23_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
            char[] chars = input.toCharArray();
            Map<Character,Integer> map = new TreeMap<Character,Integer>();
            for(char c:chars){
                if(!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }
            int min = Integer.MAX_VALUE;
            for (Character key : map.keySet()) {
                if (min > map.get(key)) {
                    min = map.get(key);//最小的次数
                }
            }
            StringBuilder res = new StringBuilder();
            for (Character c : chars) {
                if (min != map.get(c)) {
                    res.append(c);
                }
            }
            System.out.println(res.toString());
            res.delete(0, res.length() - 1);
            map.clear();
        }

    }
}
