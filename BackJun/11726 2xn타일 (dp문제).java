package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    static int dp[];

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n+1];

        dp[1] =1;
        if(n>=2) // 런타임 에러 방지
            dp[2]=2;

        for(int i=3;i<=n;i++) {
            dp[i] = dp[i-1]+ dp[i-2];
            dp[i] = dp[i] % 10007; //int타입의 데이터 범위를 벗어나지 않게 나머지값을 저장한다.
        }

        System.out.println(dp[n]);



    }

}
