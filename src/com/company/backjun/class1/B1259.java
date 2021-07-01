package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> ar = new ArrayList<>();

        while(true){
            int i = sc.nextInt();
            if(i==0){
                break;
            }
            ar.add(i);
        }

        for(int a : ar){
            String string = String.valueOf(a);
            char[] chars = string.toCharArray();
            boolean flag = true;
            for(int i=0;i<chars.length;i++){
                if(chars[i] == chars[chars.length-i-1]){

                }else {
                    flag =false;
                }
            }
            if(!flag){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}
