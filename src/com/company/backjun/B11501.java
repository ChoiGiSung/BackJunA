package com.company.backjun;


import java.util.*;
public class B11501 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int all = sc.nextInt();
        int count=0;

        for (int i = 0; i <all; i++) {
            int getAll=sc.nextInt();
            sc.nextLine();
            String[] split = sc.nextLine().split(" ");

            for (int j = 0; j < split.length; j++) {
                int rocalInt= Integer.parseInt(split[j]);
                int max=0;
                for (int k = j; k < split.length; k++) {
                    if(max < Integer.parseInt(split[k])){
                        max=Integer.parseInt(split[k]);
                    }
                }
                count+=max-rocalInt;
            }
            System.out.println(count);
            count=0;
        }

    }
}
