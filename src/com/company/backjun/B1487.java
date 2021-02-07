package com.company.backjun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import java.util.*;
public class B1487 {

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int all= sc.nextInt();

        ArrayList<Integer> Ar=new ArrayList<>();
        ArrayList<Integer> sum=new ArrayList<>();
        for (int i = 0; i < all; i++) {
            int input1=sc.nextInt();
            int input2=sc.nextInt();
            Ar.add(input1-input2);
        }

        Collections.sort(Ar);

        for (int i = 0; i <Ar.size(); i++) {
            Integer integer = Ar.get(i);
            int intSum = integer + integer*(Ar.size() - (i + 1));

            sum.add(intSum);
        }

        int max=0;
        String maxStr="";
        for (int i = 0; i < sum.size(); i++) {
            if(max == sum.get(i)){
                maxStr =Integer.toString(Ar.get(i));
            }else if(max < sum.get(i)){
                max=sum.get(i);
                maxStr=Integer.toString(Ar.get(i));
            }
        }
        System.out.println(maxStr);

    }


}