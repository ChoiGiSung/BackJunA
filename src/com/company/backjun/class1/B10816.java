package com.company.backjun.class1;

import java.util.*;

public class B10816 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int all = sc.nextInt();

        for (int i = 0; i < all; i++) {
            int input = sc.nextInt();

            if(map.get(input)==null){
                map.put(input,1);
            }else {
                map.put(input,map.get(input)+1);
            }

        }

        int localAll = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <localAll; i++) {
            int input = sc.nextInt();

            if(map.get(input)==null){
                builder.append("0");
            }else {
                builder.append(map.get(input));
            }

            if(i != localAll-1){
                builder.append(" ");
            }
        }
        System.out.println(builder.toString());
    }
}
