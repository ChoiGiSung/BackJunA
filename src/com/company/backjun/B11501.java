package com.company.backjun;


import java.util.*;
public class B11501 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long all = sc.nextInt();
        long count=0;

        for (int i = 0; i <all; i++) {
            long getAll=sc.nextInt();
            sc.nextLine();
            String[] split = sc.nextLine().split(" ");

            long max = Long.parseLong(split[split.length-1]);
            for (int j = split.length-1 ; j >= 0; j--) {
                if(max >= Long.parseLong(split[j])){
                    count+=max-Integer.parseInt(split[j]);
                }else {
                    max = Long.parseLong(split[j]);
                }
            }
            System.out.println(count);
            count=0;
        }

    }
}
