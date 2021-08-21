package com.company.backjun.sort;

import java.util.Scanner;

public class B2750BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int[] array = new int[all];


        for(int i = 0; i < all; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 1 ; i <= array.length ; i++) {

            for (int j = 0; j < array.length -i; j++) {
                int first  = array[j];
                int second  = array[j+1];

                if(first > second){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }

        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
