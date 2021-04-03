package com.company.backjun.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Solution solution = new Test2.Solution();

        solution.solution(6,6,new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}});

    }

    static int[][] arr;

    static class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {
            int[] answer = {};

            List<Integer> answerList = new ArrayList<>();
            arr = new int[rows][columns];

            int count = 1;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = count;
                    count++;
                }
            }


            for (int[] query : queries) {
                for (int i = 0; i < query.length; i++) {
                    query[i] = query[i]-1;
                }
                checkMaxMin(query);
            }


            return answer;
        }

        private int checkMaxMin(int[] query) {

            int maxMin = 10000;
            int x = query[0];
            int y = query[1];
            int temp = arr[x][y+1];

            int x2 = query[2];
            int y2 = query[3];

            //처음
            for (int i = y+1; i < y2+1; i++) {
                if(temp < maxMin){
                    maxMin =temp;
                }
                System.out.println(arr[x][i]);
                arr[x][i] = arr[x][i-1];
                temp = arr[x][i+2];
            }

            return maxMin;

        }
    }
}
