package com.company.backjun.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2750InsertSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int[] array = new int[all];


        for(int i = 0; i < all; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < array.length ; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }else {
                    break;
                }
            }
        }


        for (int i : array) {
            System.out.println(i);
        }

    }
}
