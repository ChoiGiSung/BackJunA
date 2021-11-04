package com.company.programmers.runing;

import java.util.Arrays;

public class SquidGame {

    class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 0;

            Arrays.sort(A);
            Arrays.sort(B);

            if (A.length == 0 || B.length == 0) {
                return 0;
            }

            int index = 0;
            for (int i : A) {

                while (i > B[index]) {
                    index++;
                    if (index > B.length - 1) {
                        return answer;
                    }
                }
                if (i < B[index]) {
                    answer++;
                    index++;
                }

                if (index > B.length - 1) {
                    return answer;
                }
            }

            return answer;
        }
    }
}
