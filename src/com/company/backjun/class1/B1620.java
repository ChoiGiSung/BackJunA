package com.company.backjun.class1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class B1620 {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        int all = sc.nextInt();
        int answer = sc.nextInt();

        Map<String,Integer> stringMap = new HashMap<>();
        Map<Integer,String> intMap = new HashMap<>();


        for (int i = 0; i < all; i++) {
            String name = sc.next();
            stringMap.put(name,i);
            intMap.put(i,name);
        }

        for (int i = 0; i < answer; i++) {
            String next = sc.next();

            try {
                int i1 = Integer.parseInt(next);
                System.out.println(intMap.get(i1-1));
            }catch (Exception e){
                System.out.println(stringMap.get(next)+1);
            }

        }

    }
}
