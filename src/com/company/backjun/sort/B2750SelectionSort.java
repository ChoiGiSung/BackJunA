package com.company.backjun.sort;

import java.util.Scanner;

public class B2750SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int[] array = new int[all];


        for(int i = 0; i < all; i++){
            array[i] = sc.nextInt();
        }


        for(int i = 0; i < all; i++){
            int minIndex = i;
            for (int j = i; j < all; j++) {
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
