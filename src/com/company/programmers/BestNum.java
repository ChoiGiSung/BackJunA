package com.company.programmers;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class BestNum {

    class Solution {
        public int[] solution(int n, int s) {
            int[] answer ;

            if(n > s){
                return new int[]{-1};
            }

            answer = new int[n];

            for (int i = 0; i < n; i++) {
                answer[i] = s/n;
            }

            for (int i = 0; i < s%n; i++) {
                answer[i]++;
            }

            Arrays.sort(answer);

            return answer;
        }
    }

    @Test
    public void  sample(){
        Solution solution = new Solution();
        int[] solution1 = solution.solution(2, 9);
        for (int i : solution1) {
            System.out.println(i);
        }
//        Assertions.assertEquals();
    }
}
