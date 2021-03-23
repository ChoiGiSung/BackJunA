package com.company.backjun.greedy;

import java.util.HashMap;
import java.util.Scanner;

import java.util.*;
public class B1864 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> Hs=new HashMap<>();

        Hs.put("-",0);
        Hs.put("\\",1);
        Hs.put("(",2);
        Hs.put("@",3);
        Hs.put("?",4);
        Hs.put(">",5);
        Hs.put("&",6);
        Hs.put("%",7);
        Hs.put("/",-1);

        //끝에서 부터 차례로 곱해주자
        while (true){
            String input=sc.next();
            if (input.equals("#")){
                break;
            }
            String[] split = input.split("");

            int answer=0;
            for (int i = 0; i < split.length; i++) {
                answer+=(Hs.get(split[split.length - i - 1]) *(int)Math.pow(8, i));
            }
            System.out.println(answer);
        }


    }

    }
