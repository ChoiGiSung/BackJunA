package com.company.backjun;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


import java.util.*;

public class B1715 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        Queue<Integer> minQ = new PriorityQueue<>();

        for (int i = 0; i < all; i++) {
            minQ.add(sc.nextInt());
        }

        int count = 0;


        if (all <= 1) {
            System.out.println(0);
            return;
        }

        while (minQ.size() != 0) {
            int getOne = minQ.poll();
            if (minQ.size() != 0) {
                int getTwo = minQ.poll();
                getOne += getTwo;
                if(minQ.size() == 0){
                    count += getOne;
                    break;
                }
                minQ.add(getOne);
            }
            count += getOne;
        }
        System.out.println(count);

    }
}
