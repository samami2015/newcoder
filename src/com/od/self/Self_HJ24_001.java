package com.od.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Self_HJ24_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            if (input.equals("")) continue;
            int n = Integer.parseInt(input);
            int[] heights = new int[n];
            String[] str_heights = br.readLine().split(" ");
            if (n <= 1) System.out.println(0);
            else {
                for (int i = 0; i < n; i++) heights[i] = Integer.parseInt(str_heights[i]);
                int[] seq = new int[n], rev_seq = new int[n];
                int[] k = new int[n];
                seq[0] = heights[0];
                int index = 1;
                for (int i = 1; i < n; i++) {
                    if (heights[i] > seq[index - 1]) {
                        k[i] = index;
                        seq[index++] = heights[i];
                    } else {
                        int l = 0, r = index - 1;
                        while (l < r) {
                            int mid = l + (r - 1) / 2;
                            if (seq[mid] < heights[i]) l = mid + 1;
                            else r = mid;
                        }
                        seq[l] = heights[i];
                        k[i] = l;
                    }
                }
                rev_seq[0] = heights[n - 1];
                index = 1;
                for (int i = n - 1 - 1; i >= 0; i--) {
                    if (heights[i] > rev_seq[index - 1]) {
                        k[i] += index;
                        rev_seq[index++] = heights[i];
                    } else {
                        int l = 0, r = index - 1;
                        while (l < r) {
                            int mid = l + (r - 1) / 2;
                            if (rev_seq[mid] < rev_seq[i]) l = mid + 1;
                            else r = mid;
                        }
                        rev_seq[l] = heights[i];
                        k[i] += l;
                    }

                }
                int max = 1;
                for (int num : k) {
                    if (max < num) max = num;
                }
                System.out.println(n - (max + 1));
            }
        }
    }
}
