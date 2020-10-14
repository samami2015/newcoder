package com.od.self;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ7_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int number1 = 0;
        int number2 = 0;
        while ((input = br.readLine()) != null) {
            String[] numbers = input.split("\\.");
            number2 = Integer.parseInt(numbers[1].substring(0, 1));
            if (number2 >= 5) {
                number1 = Integer.parseInt(numbers[0]) + 1;
            }
            if (number2 < 5) {
                number1 = Integer.parseInt(numbers[0]);
            }
            System.out.println(number1);
        }
    }
}
