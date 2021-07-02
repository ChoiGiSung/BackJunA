package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B1654 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int has = sc.nextInt();
        int all = sc.nextInt();

        List<Long> result = new ArrayList<>();

        for(int i = 0; i<has;i++){
            result.add(sc.nextLong());
        }
        Collections.sort(result);

        long max = result.get(has-1);
        long min = 1;

        while(min <= max){
            long middle = (max+min)/2;
            int count = 0;

            for(long s : result){
                count+=s/middle;
            }

            if(count >= all){
                min = middle + 1;
            }else {
                max = middle -1;
            }
        }

        System.out.println(max);
    }
}
