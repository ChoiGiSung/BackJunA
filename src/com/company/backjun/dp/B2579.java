package com.company.backjun.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < all; i++) {
            list.add(sc.nextInt());
        }



        int[] dp = new int[all];

        dp[0]= list.get(0);
        if(all == 1){
            System.out.println(dp[0]);
            return;
        }
        dp[1]= Math.max(list.get(0)+list.get(1),list.get(1));
        if(all == 2){
            System.out.println(dp[1]);
            return;
        }
        dp[2]= Math.max(list.get(0)+list.get(2),list.get(1)+list.get(2));



        if(all == 1 ||all == 2 ) {
            System.out.println(dp[all-1]);
            return;
        }
        for (int i = 3; i < all; i++) {
            dp[i] = Math.max(dp[i-2]+list.get(i),dp[i-3]+list.get(i-1)+list.get(i));
        }

        System.out.println(dp[all-1]);

    }
}
