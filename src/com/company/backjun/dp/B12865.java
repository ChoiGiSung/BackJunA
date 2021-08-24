package com.company.backjun.dp;

import java.util.Scanner;

public class B12865 {

    static int[][] dp;
    static int w[];
    static int v[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int M = sc.nextInt();

        dp = new int[all+1][M+1];

        w = new int[all+1];
        v = new int[all+1];

        for (int i = 0; i < all; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= all; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = dp[i-1][j];
                if( j-w[i] >= 0){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }

            }

        }

        System.out.println(dp[all][M]);

    }
}
