package com.company.backjun.test;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 1, 3, 2};

        for (int i = 0; i < array.length - i; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }

    }


}
