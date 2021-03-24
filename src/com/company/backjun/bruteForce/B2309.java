package com.company.backjun.bruteForce;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class B2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> pq = new PriorityQueue<>();

        int[] allPerson = new int[9];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            allPerson[i] = sc.nextInt();
            count += allPerson[i];
        }

        for (int i = 0; i < allPerson.length - 1; i++) {
            for (int j = i + 1; j < allPerson.length; j++) {

                if (count - (allPerson[i] + allPerson[j]) <= 100) {
                    makePQ(i,j,allPerson,pq);
                    return;
                }

            }


        }

    }

    private static void makePQ(int i, int j, int[] allPerson, Queue<Integer> pq) {
        for (int k = 0; k < allPerson.length; k++) {
            if(k != i && k != j){
                pq.add(allPerson[k]);
            }
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
