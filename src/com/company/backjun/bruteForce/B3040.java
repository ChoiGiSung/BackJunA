package com.company.backjun.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B3040 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Integer> all =new ArrayList<>();
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int getInt = sc.nextInt();
            all.add(getInt);
            count+=getInt;
        }

        for (int i = 0; i < all.size()-1; i++) {
            for (int j = i+1; j < all.size(); j++) {
                if(count -all.get(i)-all.get(j) == 100){
                    for (int k = 0; k < all.size(); k++) {
                        if(i != k && j != k){
                            System.out.println(all.get(k));
                        }

                    }
                    break;
                }
            }
        }


    }
}
