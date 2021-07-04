package com.company.backjun.class1;

import java.util.Arrays;
import java.util.Scanner;

public class B1920 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int first = sc.nextInt();
        int[] firstAr = new int[first];
        for (int i = 0; i <first; i++) {
            firstAr[i] = sc.nextInt();
        }
        int second = sc.nextInt();
        int[] secondAr = new int[second];
        for (int i = 0; i <second; i++) {
            secondAr[i] = sc.nextInt();
        }

        Arrays.sort(firstAr);

        for(int i : secondAr){
            find(firstAr,i);
        }



    }

    private static void find(int[] firstAr, int i) {
        int min = 0;
        int max = firstAr.length-1;

        while(min <= max){
            int middle = (min+max)/2;
            int middleColumn = firstAr[middle];
            if (middleColumn == i){
                System.out.println("1");
                return;
            }else if(middleColumn > i){
                max = middle-1;
            }else if(middleColumn < i){
                min = middle + 1;
            }
        }
        System.out.println("0");
    }
}
