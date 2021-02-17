package com.company.backjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;
public class B2847 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer>num=new ArrayList<>();
        int allInt=sc.nextInt();
        for (int i = 0; i < allInt; i++) {
            num.add(sc.nextInt());
        }

        int count=0;
        for (int i = num.size()-1; i>0; i--) {
            int nowInt=num.get(i);
            int preInt=num.get(i-1);

            while (preInt>=nowInt){
                preInt-=1;
                count++;
            }
            num.remove(i-1);
            num.add(i-1,preInt);

        }

        System.out.println(count);

    }
}
