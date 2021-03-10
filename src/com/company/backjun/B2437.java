package com.company.backjun;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import java.util.*;

public class B2437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < all; i++) {
            ar.add(sc.nextInt());
        }

        Collections.sort(ar);

        int realSum = 0;
        int result =0;

        for (int i = 0; i < all; i++) {
            if (realSum + 1 >= ar.get(i)) {
                realSum += ar.get(i);
            } else {
                result = realSum+1;
                break;
            }

            if(i == all-1){
                result = realSum+1;
            }
        }

        System.out.println(result);

    }

}
