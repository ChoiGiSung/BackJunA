package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

public class BingGo {
    @Test
    void test(){
        Solution solution = new Solution();
    }

    class Solution {
        public int solution(int[][] board, int[] nums) {
            int answer = 0;

            for (int num : nums) {
                for (int[] ints : board) {
                    for (int i = 0; i < ints.length; i++) {
                        if (ints[i] == num) {
                            ints[i] = 0;
                        }
                    }
                }
            }


            //가로
            answer += checkWidth(board);
            //세로
            answer += checkHeight(board);
            //대각 왼쪽
            answer += checkLeftDiagonal(board);

            //대각 오른쪽
            answer += checkRightDiagonal(board);

            return answer;
        }

        private int checkRightDiagonal(int[][] board) {
            int result = 0;
            int flag = 0;
            for (int i = 0; i < board.length; i++) {
                int[] ints = board[i];
                int sample = board.length - i -1;
                for (int j = sample; j <= sample; j++) {
                    int anInt = ints[j];
                    if(anInt == 0){
                        flag ++;
                    }
                }

            }
            if(flag == board.length){
                result++;
            }
            return result;
        }

        private int checkLeftDiagonal(int[][] board) {
            int result = 0;
            int flag = 0;
            for (int i = 0; i < board.length; i++) {
                int[] ints = board[i];
                for (int j = i; j <= i; j++) {
                    int anInt = ints[j];
                    if(anInt == 0){
                        flag ++;
                    }
                }

            }
            if(flag == board.length){
                result++;
            }
            return result;
        }

        private int checkHeight(int[][] board) {
            int result = 0;

            for (int i = 0; i < board.length; i++) {
                int flag = 0;
                for (int j = 0; j < board[i].length; j++) {
                    int anInt = board[i][j];
                    if (anInt != 0) {
                        flag++;
                    }
                }
                if (flag == board.length) {
                    result++;
                }
            }
            return result;
        }

        private int checkWidth(int[][] board) {
            int result = 0;
            for (int[] ints : board) {
                int flag = 0;
                for (int anInt : ints) {
                    if (anInt == 0) {
                        flag++;
                    }
                }
                if (flag == ints.length) {
                    result++;
                }
            }
            return result;
        }
    }
}
