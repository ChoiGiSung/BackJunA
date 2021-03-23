package com.company.backjun.greedy;

import java.util.*;

public class B1541 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        String[] split = s.split("-");

        int sum= 0;



        for (int i = 0; i < split.length; i++) {
            int rocalSum=0;
            String[] split1 = split[i].split("\\+");

            for (String s2 : split1) {
                rocalSum+=Integer.parseInt(s2);
            }
            if( i ==0){
                sum+=rocalSum;
                continue;
            }

            sum-=rocalSum;
        }

        System.out.println(sum);


    }
}
