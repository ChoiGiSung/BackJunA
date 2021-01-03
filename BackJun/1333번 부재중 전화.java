package com.company;

import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int input1=sc.nextInt();//전체 노래 수
        int input2=sc.nextInt();
        int input3=sc.nextInt();

        int time=0;

        for (int i = 0; i < input1; i++) {
            time+=input2;
            for (int j = 0; j <5; j++) {
                if(time%input3==0){
                    System.out.println(time);
                    return;
                }
                time+=1;
            }
        }

        for (int i = 0; i < 1000; i++) {
            if(time%input3==0){
                System.out.println(time);
                return;
            }
            time+=1;
        }
    }
}
