package com.company.backjun.test;


public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 3, 2};

        //버블과 삽입의 차이점
        //삽입은 앞의 정렬을 보장해준다는 것
        for (int i = 1; i < array.length; i++) {

            int key = array[i];

            for (int j = i-1; j >=0; j--) {
                if(array[j] > key){
                    int temp = array[j+1];
                    array[j+1] =array[j];
                    array[j]=temp;
                    key=array[j];
                }

            }

        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
