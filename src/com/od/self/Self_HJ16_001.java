package com.od.self;

import java.util.Scanner;

public class Self_HJ16_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //总钱数
        int N = scanner.nextInt();
        //购买的物品个数
        int m = scanner.nextInt();
        int[] f = new int[N + 1];
        //分组，good[i][0]为主件，good[i][1]为附件1,good[i][2]为附件2
        Good[][] good1 = new Good[60][4];
        for (int i = 1; i <= m; i++) {
            int v = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            Good t = new Good(v, v * p);
            if (q == 0) {
                good1[i][0] = t;
            } else {
                if (good1[q][1] == null) {
                    good1[q][1] = t;
                } else {
                    good1[q][2] = t;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = N; j >= 0 && good1[i][0] != null; j--) {
                //以下代码从分组中选择价值最大。共五中情况：不选主件，选主件，选附件1和主件，选附件2和主件，选附件2、附件1和主件
                Good master = good1[i][0];
                int max = f[j];
                if (j >= master.v && max < f[j - master.v] + master.vp) {
                    max = f[j - master.v] + master.vp;
                }
                int vt;
                if (good1[i][1] != null) {
                    if (j >= (vt = master.v + good1[i][1].v) && max < f[j - vt] + master.vp + good1[i][1].vp) {
                        max = f[j - vt] + master.vp + good1[i][1].vp;
                    }
                }
                if (good1[i][2] != null) {
                    if (j >= (vt = master.v + good1[i][1].v + good1[i][2].v) && max < f[j - vt] + master.vp + good1[i][1].vp + good1[i][2].vp) {
                        max = f[j - vt] + master.vp + good1[i][1].vp + good1[i][2].vp;
                    }
                }
                f[j] = max;
            }
        }
        System.out.println(f[N]);
    }
}
