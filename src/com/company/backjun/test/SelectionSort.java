package com.company.backjun.test;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 1, 3, 2};

        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }

            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
