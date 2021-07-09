package com.company.backjun.class1;

import java.util.*;

public class B1764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> nMap = new HashMap<>();
        List<String> ar = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            nMap.put(sc.next(),0);
        }

        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();

            if(nMap.get(s) != null){
                ar.add(s);
            }

        }

        Collections.sort(ar);
        System.out.println(ar.size());
        for (String s : ar) {
            System.out.println(s);
        }
    }
}
