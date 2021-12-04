package com.company.programmers.runing;

import java.util.Arrays;

public class TestSample {

    class Solution {
        public int solution(int[] people, int[] tshirts) {
            int answer = 0;
            int index = tshirts.length - 1;

            Arrays.sort(people);
            Arrays.sort(tshirts);

            for (int i = people.length - 1; i >= 0; i--) {
                if(index < 0){
                    return answer;
                }

               if(people[i] <= tshirts[index]){
                   answer++;
                   index--;
               }

            }

            return answer;
        }
    }
}
