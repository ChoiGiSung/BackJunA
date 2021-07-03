package com.company.backjun.class1;

import java.util.Scanner;

public class B2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = sc.nextInt();
        int move = 1;
        int block = 1;
        long count = 6;

        while(answer > move){
            move+=count;
            count+=6;
            block++;
        }

        System.out.println(block);
    }
}
