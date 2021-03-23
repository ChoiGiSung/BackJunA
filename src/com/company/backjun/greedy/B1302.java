package com.company.backjun.greedy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import java.util.*;
public class B1302 {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);

        HashMap<String,Integer> Hs=new HashMap<>();

        int all=sc.nextInt();
        for (int i = 0; i < all; i++) {
            String input=sc.next();
            if(Hs.get(input) == null){
                Hs.put(input,1);
            }else {
                Hs.put(input,Hs.get(input)+1);
            }
        }

        int max=0;
        String maxStr="";
        Iterator<String> iterator = Hs.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            if (max == Hs.get(key) && maxStr.compareTo(key)>0){ //수가 같을 ㄸㅐ
                maxStr=key;
            }else if(max < Hs.get(key)){
                max=Hs.get(key);
                maxStr=key;
            }
        }
        System.out.println(maxStr);
    }

}
