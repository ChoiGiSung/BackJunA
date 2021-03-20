package com.company.backjun;

import java.util.Scanner;

public class B16953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long first = sc.nextLong();
        long last = sc.nextLong();

        long count = 1;
        while (last != first) {
            if (last < first) {
                System.out.println(-1);
                return;
            }
            if (last % 2 == 0) {
                last /= 2;

            } else if (last % 10 == 1) {
                last /= 10;

            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}
