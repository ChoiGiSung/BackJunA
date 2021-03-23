package com.company.backjun.greedy;

import java.util.Scanner;

public class B2839 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int sugar3=3;
        int sugar5=5;

        int AllSugar=sc.nextInt();

        int count=0;

        while (AllSugar>0){
            if(AllSugar % sugar5 == 0){
                count+=AllSugar/sugar5;
                break;
            }else if(AllSugar%3==0){
                AllSugar-=3;
                count++;
            }else if(AllSugar > 5){
                AllSugar -=5;
                count++;
            }else {
                count = -1;
                break;
            }

        }
        System.out.println(count);

    }
}
