package com.company.backjun;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import java.util.*;

public class B1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minQ = new PriorityQueue<>();

        for (int i = 0; i < all; i++) {
            int getInput = sc.nextInt();
            if (getInput > 0) {
                maxQ.add(getInput);
            } else {
                minQ.add(getInput);
            }
        }

        int count = 0;

        int maxCount = 0;
        int minCount = 0;

        while (maxQ.size() != 0) {
            int getOne = maxQ.poll();
            if (maxQ.size() != 0) {
                int getTwo = maxQ.poll();
                if (getTwo == 1) {
                    getOne += getTwo;
                } else {
                    getOne *= getTwo;
                }
            }
            maxCount += getOne;
        }

        while (minQ.size() != 0) {
            int getOne = minQ.poll();
            if (minQ.size() != 0) {
                int getTwo = minQ.poll();
                getOne *= getTwo;
            }
            minCount += getOne;
        }

        count=maxCount+minCount;
        System.out.println(count);

    }
}
