package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearch {

    @Test
    void test(){
        Solution solution = new Solution();
        solution.solution(new int[]{120, 110, 140, 150},485);
    }

    class Solution {
        public int solution(int[] budgets, int M) {
            int answer = 0;
            Arrays.sort(budgets);
            int max = budgets[budgets.length-1];
            int min = 0;

            while (min < max){
                int mid = (min+max)/2;
                int sum = 0;
                for (int budget : budgets) {
                    if(budget > mid){
                        sum+=mid;
                    }else {
                        sum+=budget;
                    }


                }

                if(sum <= M){
                    min = mid+1;
                    answer = mid;
                }else {
                    max = mid-1;
                }
            }

            return answer;
        }
    }

}
