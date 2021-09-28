package com.company.programmers.week;

public class Week8 {

    class Solution {
        public int solution(int[][] sizes) {
            for (int i = 0; i < sizes.length; i++) {
                int[] getArray = sizes[i];
                if(getArray[0] > getArray[1]){
                    swap(getArray);
                }
            }
            return getMax(sizes);
        }

        private int getMax(int[][] sizes) {
            int maxX = 0;
            int maxY = 0;
            for (int[] size : sizes) {
                int x = size[0];
                int y = size[1];

                if(maxX < x){
                    maxX = x;
                }

                if (maxY < y){
                    maxY = y;
                }
            }
            return maxX * maxY;
        }

        public int[] swap(int[] arr){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            return arr;
        }
    }
}
