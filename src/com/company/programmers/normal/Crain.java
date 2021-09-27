package com.company.programmers.normal;

import java.util.ArrayList;
import java.util.Stack;

public class Crain {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer>resultStack=new Stack<>();
            ArrayList<Stack<Integer>> Ar=new ArrayList<>();
            Ar.add(new Stack<>());
            for (int i = 0; i < board.length; i++) {
                Stack<Integer>newStack=new Stack<>();
                for (int j =board.length-1; j >=0; j--) {
                    int item = board[j][i];
                    if(item != 0)
                        newStack.push(item);
                }
                Ar.add(newStack);
            }

            for (int i = 0; i < moves.length; i++) {
                int index = moves[i];
                Stack<Integer> getStack = Ar.get(index);

                //스택이 비어 있지 않다면 값을 빼서 비교 -> 같다면 삭제 같지 않으면 push
                if(!getStack.isEmpty()){
                    Integer getPop = getStack.pop();
                    if(resultStack.isEmpty()){
                        resultStack.push(getPop);
                    }else if (resultStack.peek() == getPop){
                        resultStack.pop();
                        ++answer;
                    }else {//같지 않으면 넣어라
                        resultStack.push(getPop);
                    }
                }

            }
            return answer*2;
        }
    }
}
