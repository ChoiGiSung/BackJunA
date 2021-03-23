package com.company.backjun.greedy;


import java.util.Scanner;

import java.util.*;
public class B1439 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input = sc.nextLine();
        boolean flag;
        int zeroCount=0;
        int oneCount=0;
        char[] getChar = input.toCharArray();
        if (input.length()==0){
            System.out.println(0);
            return;
        }


        flag = input.startsWith("0")? false:true;
        if (!flag){
            zeroCount++;
        }else {
            oneCount++;
        }

        char nowChar=getChar[0];

        for (int i = 1; i < getChar.length; i++) {
            if(nowChar != getChar[i]){
                if(flag){
                    zeroCount++;
                    flag=false;
                    nowChar=getChar[i];
                }else {
                    oneCount++;
                    flag=true;
                    nowChar=getChar[i];
                }
            }
        }

        System.out.println(Math.min(zeroCount,oneCount));

    }
}
