package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2775 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();



        for(int i=0;i<all;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] ar = new int[k+1][n];
            for (int j = 0; j < 1; j++) {
                for (int l = 0; l <n; l++) {
                    ar[j][l] = l+1;
                }
            }

            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < n; l++) {
                    if(l == 0){
                        ar[j][l] = 1;
                        continue;
                    }
                    ar[j][l] = ar[j][l-1] +ar[j-1][l];
                }

            }
            System.out.println(ar[k][n-1]);
        }
    }
}
