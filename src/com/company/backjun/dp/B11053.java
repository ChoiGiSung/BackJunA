package com.company.backjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B11053 {


    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int d[] = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        d[0] = 1;

        for (int i = 1; i < n; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i : d) {
            max = Math.max(max, i);
        }

        System.out.println(max);

    }

}
