package com.company;

import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int all =sc.nextInt();

        int dp[]=new int [12];
        int dpinPut[]=new int [all];

        dp[1]=1;// 1을 만드는 경우의 수는 1개
        dp[2]=2;// 2을 만드는 경우의 수는 2개
        dp[3]=4;// 3을 만드는 경우의 수는 4개
                // 3을 만드는 경우의 수는 7개
        for (int i = 4; i < 12; i++) {
            dp[i]= dp[i-3]+dp[i-2]+dp[i-1];
        }
        for (int i = 0; i <all; i++) {
            dpinPut[i]= sc.nextInt();

        }

        for (int i = 0; i < all; i++) {
            System.out.println(dp[dpinPut[i]]);
        }
    }
}
