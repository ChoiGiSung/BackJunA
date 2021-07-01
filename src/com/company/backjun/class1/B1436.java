package com.company.backjun.class1;

import java.util.Scanner;

public class B1436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int count = 666;
        String six = "666";
        int countResult = 1;

        while (countResult < i){
            count++;
            if(String.valueOf(count).contains(six)){
                countResult++;
            }
        }

        System.out.println(count);

    }
}
