package com.company.backjun.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.util.*;
public class B11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count=0;
        List<Integer> Ar = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Ar.add(sc.nextInt());
        }
        Collections.reverse(Ar);

        for (int i = 0; i < Ar.size(); i++) {
            if(K<=0){
                break;
            }

            if(K >=Ar.get(i) ){
                count+=K/Ar.get(i);
                K%=Ar.get(i);
            }

        }

        System.out.println(count);
    }
}
