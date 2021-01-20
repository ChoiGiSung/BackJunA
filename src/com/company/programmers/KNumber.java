package com.company.programmers;

import java.util.Arrays;

public class KNumber {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];


            for (int i = 0; i < commands.length; i++) {
                int iNum = commands[i][0];
                int jNum = commands[i][1];
                int KNum = commands[i][2];

                int[] getResult = Arrays.copyOfRange(array, iNum-1, jNum);
                Arrays.sort(getResult);

                answer[i]=getResult[KNum-1];
            }


            return answer;
        }
    }
}
