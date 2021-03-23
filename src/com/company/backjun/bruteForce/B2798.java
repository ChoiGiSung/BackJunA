package com.company.backjun.bruteForce;

import java.util.Scanner;

public class B2798 {

    static long max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long[] all = new long[(int) n];

        for (int i = 0; i < n; i++) {
            all[i] = sc.nextLong();
        }


        for (int i = 0; i < all.length - 2; i++) {
            for (int j = i+1; j < all.length - 1; j++) {
                for (int k = j+1; k < all.length; k++) {
                    long count = all[i] + all[j] + all[k];
                    checkNum(count,m);
                }
            }

        }
        System.out.println(max);

    }

    private static void checkNum(long count, long m) {
        if(count <= m && max <count){
            max=count;
        }
    }
}
