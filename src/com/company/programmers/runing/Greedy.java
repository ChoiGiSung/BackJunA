package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Greedy {

    @Test
    void test(){
        Solution solution = new Solution();
        int solution1 = solution.solution(11, new int[]{4, 11}, 1);
        System.out.println(solution1);
    }

    class Solution {
        public int solution(int n, int[] stations, int w) {
            int answer = 0;
            int position = 1;
            int si = 0;

            while (position <= n){
                if(si < stations.length && stations[si] - w <= position){
                    position = stations[si] + w + 1;
                    si++;
                }else {
                    answer++;
                    position += w + 1 + w;
                }

            }



            return answer;
        }
    }
}
