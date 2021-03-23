package com.company.backjun.greedy;


import java.util.*;
import java.util.stream.Collectors;

import java.util.*;
public class B2217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer>num=new ArrayList<>();
        int allInt = sc.nextInt();

        for (int i = 0; i < allInt; i++) {
            num.add(sc.nextInt());
        }

        Collections.sort(num);

        List<Integer> weight=new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            weight.add(num.get(i)*(num.size()-i));
        }

        System.out.println(Collections.max(weight));




    }
}
