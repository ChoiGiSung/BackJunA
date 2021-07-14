package com.company.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Develop {

    public static void main(String[] args) {
        Develop develop = new Develop();
        Develop.Solution solution = new Develop.Solution();

        solution.solution(new int[]{93,30,55},new int[]{1,30,5});
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            List<Integer> ar = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < progresses.length; i++) {
                int num = 100 - progresses[i];

                if(num%speeds[i] !=0){
                    q.add((num/speeds[i])+1);
                }else {
                    q.add(num/speeds[i]);
                }

            }


            while (!q.isEmpty()){
                int count = 1;
                Integer first = q.poll();

                while (!q.isEmpty()){
                    if(first<q.peek()){
                        break;
                    }
                    q.poll();
                    count++;
                }
                ar.add(count);
            }

            int[] answer = new int[ar.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = ar.get(i);
            }
            return answer;
        }
    }
}
