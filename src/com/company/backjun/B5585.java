package com.company.backjun;

import java.util.Scanner;

public class B5585 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int monrey=1000;
        int pay=sc.nextInt();


        int payBack=monrey-pay;

        int count=0;

        if (payBack/500 !=0){
            count+=payBack/500;
            payBack-=(count*500);
        }
        if (payBack/100 !=0){
            count+=payBack/100;
            payBack-=(payBack/100*100);

        }
        if (payBack/50 !=0){
            count+=payBack/50;
            payBack-=(payBack/50*50);

        }
        if (payBack/10 !=0){
            count+=payBack/10;
            payBack-=(payBack/10*10);

        }

        if (payBack/5 !=0){
            count+=payBack/5;
            payBack-=(payBack/5*5);

        }
        if (payBack/1 !=0){
            count+=payBack/1;
            payBack-=(payBack/1*1);

        }

        System.out.println(count);

    }
}
