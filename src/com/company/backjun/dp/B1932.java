package com.company.backjun.dp;


import java.util.*;
public class B1932 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int all = sc.nextInt();
        int[][] pyramid = new int[all][all];

        for (int i = 0; i < all; i++) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < all; i++) {
            for (int j = 0; j <= i; j++) {
                int left=0;
                int right=0;
                try{
                     left=pyramid[i-1][j-1];
                }catch (Exception e){
                    left = 0;
                }
                try{
                    right=pyramid[i-1][j];
                }catch (Exception e){
                    right = 0;
                }

                pyramid[i][j] +=Math.max(left,right);
            }
        }

        int max = 0;
        for (int i = 0; i < all; i++) {
            if(max < pyramid[all-1][i]){
                max=pyramid[all-1][i];
            }
        }

        System.out.println(max);
    }
}
