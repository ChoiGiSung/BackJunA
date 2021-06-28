package com.company.programmers;

import java.util.*;

public class MoreSpicy {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1, 2, 3, 9, 10, 12},7);
    }

    static class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            Arrays.sort(scoville);
            Queue<Integer> scopil = new PriorityQueue<>();

            if(scoville[0] >= K){
                return 0;
            }

            for (int i : scoville) {
                scopil.add(i);
            }

            try {
                while (scopil.peek() < K){
                    int first = scopil.poll();
                    int second = scopil.poll();

                    scopil.add(first+second*2);
                    answer++;
                }
            }catch (Exception e){
                return -1;
            }



            return answer;
        }
    }
}
