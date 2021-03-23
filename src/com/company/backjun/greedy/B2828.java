package com.company.backjun.greedy;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class B2828 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        int n= sc.nextInt();
        int m= sc.nextInt();

        int allApple=sc.nextInt();

        int left=0;
        int right=m-1;

        int count=0;
        for (int i = 0; i < allApple; i++) {
            int ground=sc.nextInt()-1;

            if(ground > right){
                int oriL=left;
                left+=(ground-right);
                right=ground;
                count+=(left-oriL);
            }else if(ground < left){
                int oriR=right;
                right+=(ground-left);
                left=ground;
                count+=(oriR-right);
            }

        }
        System.out.println(count);
    }
}
