package com.company.programmers.normal;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(6);
    }


    static class Solution {
        public int[] solution(int n) {

            int[][] triangle = new int[n][n];
            int max = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = -1;
                    max++;
                }
            }

            int i = 0, j = 0;
            int count = 1;



            while (count < max) {
                if( count == max-1){
                    triangle[i ][j] = count;
                    break;
                }
                while (i < n-1 && triangle[i + 1][j] == -1) {
                    triangle[i++][j] = count++;
                }
                while (j< n-1 && triangle[i][j +1] == -1) {
                    triangle[i][j++] = count++;
                }
                while (i - 1 > 0 && j - 1 > 0 && triangle[i - 1][j - 1] == -1) {
                    triangle[i--][j--] = count++;
                }
            }
            int[] answer = new int[count];


            count = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j <= i; j++) {
                    answer[count++] = triangle[i][j];

                }
            }

            return answer;
        }
    }

}
