package com.company.backjun.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B2386 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> word = new ArrayList<>();


        String text;
        while (!(text = sc.nextLine()).equals("#")){
            word.add(text);
        }

        List<Character> alpha = word.stream().map(x -> x.substring(0, 1).charAt(0)).collect(Collectors.toList());

        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < alpha.size(); i++) {
            char getAlpha = alpha.get(i);
            char[] getChar = word.get(i).toCharArray();
            int countInt=0;
            for (char c : getChar) {
                if(Character.toUpperCase(c) == Character.toUpperCase(getAlpha)){
                    countInt++;
                }
            }
            count.add(countInt-1);
        }

        for (int i = 0; i < count.size(); i++) {
            System.out.println(alpha.get(i)+" "+count.get(i));
        }
    }
}
