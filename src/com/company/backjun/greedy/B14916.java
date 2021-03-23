package com.company.backjun.greedy;

import java.util.*;
public class B14916 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int All=sc.nextInt();

        int count=0;
        while (All>0){
            if (All % 5 ==0){
                count+=All/5;
                break;
            }else if(All % 2 == 0){
                All-=2;
                count++;
            }else if(All > 5){
                All-=5;
                count++;
            }else {
                count=-1;
                break;
            }
        }

        System.out.println(count);

    }
}
