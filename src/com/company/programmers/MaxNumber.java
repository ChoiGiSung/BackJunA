package com.company.programmers;

import java.util.Stack;

public class MaxNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("1231234",3);
    }

    static class Solution {
        public String solution(String number, int k) {
            String answer = "";

            char[] nums = number.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (char num : nums) {
                while (!stack.isEmpty() && stack.peek() < num && k != 0) {
                    stack.pop();
                    k--;
                }
                stack.add(num);
            }

            while (k!=0){
                stack.pop();
                k--;
            }

            for (Character character : stack) {
                answer+=character.toString();
            }


            return answer;
        }
    }
}
