package com.company.programmers;

public class Measure {
    public static void main(String[] args) {
        Solution.solution(13,17);
    }


    static class Solution {
        public static int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i%j == 0){
                         count ++;
                     }
                }
                if(count % 2 ==0){
                    answer += i;
                }else {
                    answer -= i;
                }

            }


            return answer;
        }
    }
}
