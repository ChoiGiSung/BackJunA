package com.company.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1});
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < progresses.length; i++) {
                int progress = progresses[i];
                int speed = speeds[i];
                int percent = 100 - progress;

                if(percent%speed == 0){
                    queue.add(percent/speed);
                }else {
                    queue.add((percent/speed)+1);
                }
            }

            List<Integer> answer = new ArrayList<>();

            while (!queue.isEmpty()){
                int first = queue.poll();
                int count = 1;

                while(!queue.isEmpty() && queue.peek() <= first){
                    queue.poll();
                    count++;
                }
                answer.add(count);
            }
            int[] ans = new int[answer.size()];
            for (int i = 0; i < answer.size(); i++) {
                ans[i] = answer.get(i);
            }

            return ans;
        }
    }
}
