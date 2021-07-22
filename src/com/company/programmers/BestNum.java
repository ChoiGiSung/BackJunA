package com.company.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class BestNum {

    class Solution {
        public int[] solution(int n, int s) {
            int[] answer ;
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            Stack<Integer> stack = new Stack<>();

            stack.add(s);

            while (!stack.isEmpty()){
                ArrayList<Integer> ar = new ArrayList<>();
                for (Integer integer : stack) {
                    ar.add(integer);
                }
                result.add(ar);

                Integer pop = stack.pop();
                if(pop != 1){
                    stack.add(pop -1);
                    stack.add(1);
                }else {
                    int sum = pop+1;
                    while (!stack.isEmpty() && stack.peek() == 1){
                        stack.pop();
                        sum+=1;
                    }
                    if(sum == s+1){
                        break;
                    }

                    Integer pop1 = stack.pop();
                    stack.add(pop1-1);
                    stack.add(sum);
                }
            }

            List<ArrayList<Integer>> collect = result.stream().filter(integers -> integers.size() == n).collect(Collectors.toList());

            if (collect.size() == 0){
                return new int[]{-1};
            }
            int maxIndex = 0;
            int max = 0;
            for (int i = 0; i < collect.size(); i++) {
                ArrayList<Integer> integers = collect.get(i);
                Integer reduce = integers.stream().reduce(1,(integer, integer2) -> integer*integer2);
                if(reduce > max){
                    max = reduce;
                    maxIndex = i;
                }
            }

            ArrayList<Integer> integers = collect.get(maxIndex);
            Collections.sort(integers);
            answer = new int[n];

            for (int i = 0; i < integers.size(); i++) {
                answer[i] = integers.get(i);
            }

            return answer;
        }
    }

    @Test
    public void  sample(){
        Solution solution = new Solution();
        int[] solution1 = solution.solution(2, 8);
        for (int i : solution1) {
            System.out.println(i);
        }
//        Assertions.assertEquals();
    }
}
