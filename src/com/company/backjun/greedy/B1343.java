package com.company.backjun.greedy;

import java.util.*;

public class B1343 {
    static String result="";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();


        char c;
        int count=0;

        for (int i = 0; i < input.length; i++) {
            c=input[i];

            if(c == 'X'){
                count++;
                if(input.length-1 == i){
                    if(count%2!=0){
                        System.out.println(-1);
                        return;
                    }else {
                        print(count);
                        count=0;
                    }
                }

            }else if(c == '.'){
                if(count % 2 !=0){
                    System.out.println(-1);
                    return;
                }else {
                    print(count);
                    result+=".";
                    count=0;
                }
            }

        }

        System.out.println(result);
    }

    private static void print(int count) {
        StringBuilder stringBuilder=new StringBuilder();

        while (count > 0){
            if(count%4==0){
                String A="AAAA";
                stringBuilder.insert(0,A.repeat(count/4));
                break;
            }
            count-=2;
            stringBuilder.append("BB");
        }

        result+=stringBuilder.toString();
    }


}
