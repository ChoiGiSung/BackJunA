package com.company.backjun.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.*;
public class B1946 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int all = sc.nextInt();

        for (int i = 0; i < all; i++) {
            ArrayList<man> ar=new ArrayList<>();
            int rocalAll=sc.nextInt();

            for (int j = 0; j < rocalAll; j++) {
                ar.add(new man(sc.nextInt(), sc.nextInt()));
            }
            Collections.sort(ar);

            int count=1;
            int getInt = ar.get(0).B;
            for (int j = 1; j < rocalAll; j++) {

                man getB = ar.get(j);

                if(getInt > getB.B){
                    getInt=getB.B;
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    static class man implements Comparable<man> {
        int A;
        int B;

        public man(int a, int b) {
            A = a;
            B = b;
        }

        @Override
        public int compareTo(man o) {
            return this.A-o.A;
        }
    }
}
