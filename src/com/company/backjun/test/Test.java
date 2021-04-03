package com.company.backjun.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            List<Integer> lottoList = new ArrayList<>();
            List<Integer> winList = new ArrayList<>();

            for (int lotto : lottos) {
                lottoList.add(lotto);
            }
            for (int w : win_nums) {
                winList.add(w);
            }

            int zeroCount = 0;
            int sameCount = 0;

            for (Integer integer : lottoList) {
                if (integer == 0) {
                    zeroCount++;
                }
                if (winList.contains(integer)) {
                    sameCount++;
                }
            }


            answer[0] = checkLank(zeroCount + sameCount);
            if (zeroCount == 0 || zeroCount == 6){
                zeroCount = sameCount;
            }
            answer[1] = checkLank(sameCount);


            return answer;
        }

        private int checkLank(int i) {
            switch (i) {
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                default:
                    return 6;
            }
        }
    }
}
