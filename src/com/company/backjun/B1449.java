package com.company.backjun;


import java.util.*;
public class B1449 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int waterWhere=sc.nextInt();
        int tapeLength=sc.nextInt();

        List<Integer>num=new ArrayList<>();
        for (int i = 0; i <waterWhere; i++) {
            num.add(sc.nextInt());
        }

        Collections.sort(num);

        int count=0;
        int hangseng=-1;

        for (Integer where : num) {
            if(where > hangseng){
                hangseng=where+tapeLength-1;
                count++;
            }
        }

        System.out.println(count);
    }
}
