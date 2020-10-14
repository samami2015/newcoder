package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Self_HJ19_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Map<String, Integer> map = new HashMap<String, Integer>();
        while ((input = br.readLine()) != null) {
            String[] params = input.split(" ");
            String fileName = params[0].substring(params[0].lastIndexOf("\\") + 1);
            String lineNo = params[1];
            if (!map.containsKey(fileName + " " + lineNo)) {
                map.put(fileName + " " + lineNo, 1);
            } else {
                map.put(fileName + " " + lineNo, map.get(fileName + " " + lineNo) + 1);
            }
            Set<Map.Entry<String, Integer>> set = map.entrySet();
            for (Map.Entry<String, Integer> entry : set) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
