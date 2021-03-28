package com.company.backjun.bruteForce;

import java.util.Scanner;

public class B2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();
        int min = 1_000_000;

        for (int i = result; i >=0; i--) {
            int getResult = getResult(i);
            if(result == getResult){
                if(min > i){
                    min = i;
                }
            }
        }
        if(min == 1_000_000){
            System.out.println(0);
            return;
        }
        System.out.println(min);

    }

    private static int getResult(int i) {
        int sum = i;
        while (i > 0){
            sum+= i%10;
            i/=10;
        }
        return sum;
    }
}
