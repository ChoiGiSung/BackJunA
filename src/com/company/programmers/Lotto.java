package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int zero= 0;
            int money = 0;

            for (int i = 0; i < lottos.length; i++) {
                if(lottos[i] == 0){
                    zero ++;
                    continue;
                }
                for (int win_num : win_nums) {
                    if(win_num == lottos[i]){
                        money ++;
                        break;
                    }
                }

            }
            int max = zero + money;
            int min =money;

            answer[0] = saturday(max);
            answer[1] = saturday(min);

            return answer;
        }

        private int saturday(int money) {

            switch (money){
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
