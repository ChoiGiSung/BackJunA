package com.company.ramdaExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]){

        String [] strs= {"a","aaa","aaao","aoao","a"};
        HashMap<String,Integer> Hs=new HashMap<>();
        Hs.put("ss",1);
        Hs.put("ss2",1);
        Hs.put("ss3",1);

        Hs.forEach((s,x)->System.out.println(s+x));
    }
}
