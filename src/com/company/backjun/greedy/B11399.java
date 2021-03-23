package com.company.backjun.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import java.util.*;
public class B11399 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int allPerson = sc.nextInt();
        List<Integer> allTime =new ArrayList<>();

        int count = 0;
        for (int i = 0; i < allPerson; i++) {
            allTime.add(sc.nextInt());

        }
        Collections.sort(allTime);

        for (int i = 0; i < allTime.size(); i++) {
            for (int j = 0; j <= i; j++) {
                count+=allTime.get(j);
            }

        }
        System.out.println(count);
    }
}
