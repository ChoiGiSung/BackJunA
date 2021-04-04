package com.company.backjun.test;

import java.util.ArrayList;
import java.util.List;

public class DevTest2 {
    public static void main(String[] args) {
        Solution solution = new DevTest2.Solution();

        solution.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});

    }

    static int[][] arr;

    static class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {


            List<Integer> answerList = new ArrayList<>();
            arr = new int[rows][columns];

            int count = 1;
            //배열 만들기
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = count;
                    count++;
                }
            }


            //배열을 돌면서 해당 차례에 가장 작은 값 찾기
            for (int[] query : queries) {
                for (int i = 0; i < query.length; i++) {
                    query[i] = query[i] - 1;
                }
                answerList.add(checkMaxMin(query));
            }

            int[] answer =new int[answerList.size()];

            for (int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }
            return answer;
        }

        private int checkMaxMin(int[] query) {

            int min = 1000;

            int x1 = query[0];
            int y1 = query[1];
            int x2 = query[2];
            int y2 = query[3];

            int max = (x2-x1)*2+(y2-y1)*2;
            int i = x1;
            int j = y1;
            int count = 0;

            while (count < max){
                int temp = arr[i+1][j];
                int temp2 = 0;

                while (j < y2){
                    if(temp < min){
                        min =temp;
                    }
                    temp2 =arr[i][j];
                    arr[i][j++] =temp;
                    temp =temp2;
                    count++;

                }

                while (i<x2){
                    if(temp < min){
                        min =temp;
                    }
                    temp2 =arr[i][j];
                    arr[i++][j] =temp;
                    temp =temp2;
                    count++;
                }

                while (j>y1){
                    if(temp < min){
                        min =temp;
                    }
                    temp2 =arr[i][j];
                    arr[i][j--] =temp;
                    temp =temp2;
                    count++;
                }

                while (i>x1){
                    if(temp < min){
                        min =temp;
                    }
                    temp2 =arr[i][j];
                    arr[i--][j] =temp;
                    temp =temp2;
                    count++;
                }
            }
            return min;

        }
    }
}
