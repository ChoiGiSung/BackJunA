package com.company.programmers.dev;

import java.util.ArrayList;
import java.util.List;

public class ArrayMove {

    class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {

            List<Integer> arr = new ArrayList<>();

            int[][] array = new int[rows][columns];
            initArray(array);

            for (int[] query : queries) {
                arr.add(getMin(array,query));
            }
            int[] answer = new int[arr.size()];

            for (int i = 0; i < arr.size(); i++) {
                answer[i] = arr.get(i);
            }
            return answer;
        }

        private int getMin(int[][] array, int[] query) {
            int one = query[0] -1 ;
            int two = query[1] -1;
            int three = query[2] -1;
            int four = query[3] -1;
            int min = Integer.MAX_VALUE;

            int temp = array[one][two];

            for (int i = two; i < four; i++) {
                int localTemp = array[one][i+1];

                array[one][i+1] = temp;
                min = Math.min(min,localTemp);
                temp = localTemp;
            }

            for (int i = one; i < three; i++) {
                int localTemp = array[i+1][four];

                array[i+1][four] = temp;
                min = Math.min(min,localTemp);
                temp = localTemp;
            }

            for (int i = four; i > two; i--) {
                int localTemp = array[three][i-1];

                array[three][i-1] = temp;
                min = Math.min(min,localTemp);
                temp = localTemp;
            }

            for (int i = three; i > one; i--) {
                int localTemp = array[i-1][two];

                array[i-1][two] = temp;
                min = Math.min(min,localTemp);
                temp = localTemp;
            }

            return min;
        }

        private void initArray(int[][] array) {
            int input = 1;

            for (int[] ints : array) {
                for (int i = 0; i < ints.length; i++) {
                    ints[i] = input;
                    input++;
                }
            }

        }
    }
}
