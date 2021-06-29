package com.company.programmers;

import java.util.EmptyStackException;
import java.util.Stack;

public class RotateParentheses {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("[](){}");
    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i <s.length(); i++) {
                char[] chars = s.toCharArray();
                try {
                    for (char aChar : chars) {
                        if(aChar == '{' || aChar == '[' || aChar == '(' ){
                            stack.add(aChar);
                        }else if(aChar =='}' && '{' == stack.peek()){
                            stack.pop();
                        }else if(aChar ==')' && '(' == stack.peek()){
                            stack.pop();
                        }else if(aChar ==']' && '[' == stack.peek()){
                            stack.pop();
                        }
                        else {
                            throw new EmptyStackException();
                        }
                    }
                }catch (EmptyStackException e){
                    stack.add(' ');
                }
                if(stack.isEmpty()){
                    answer++;
                }
                stack.clear();
                s = s.substring(1,s.length())+s.substring(0,1);
            }


            return answer;
        }
    }
}
