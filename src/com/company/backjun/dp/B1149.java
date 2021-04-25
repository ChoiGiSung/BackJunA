package com.company.backjun.dp;


import java.io.IOException;
import java.util.*;

public class B1149 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int all = sc.nextInt();
        int[][] cost = new int[all][all];

        for (int i = 0; i < cost.length; i++) {

            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }

        for (int i = 1; i < cost.length; i++) {

            cost[i][0] += Math.min(cost[i-1][1],cost[i-1][2]) ;
            cost[i][1] += Math.min(cost[i-1][2],cost[i-1][0]) ;
            cost[i][2] += Math.min(cost[i-1][1],cost[i-1][0]) ;

        }

        System.out.println(Math.min(Math.min(cost[all-1][0],cost[all-1][1]),cost[all-1][2]));
    }

}
