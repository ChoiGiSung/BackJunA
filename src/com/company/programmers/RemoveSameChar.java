package com.company.programmers;

import java.util.Stack;

public class RemoveSameChar {

    class Solution
    {
        public int solution(String s)
        {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
                    stack.pop();
                }else {
                    stack.add(s.charAt(i));
                }

            }

            if(stack.size() == 0){
                return 1;
            }

            return 0;
        }
    }
}
