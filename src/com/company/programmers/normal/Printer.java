package com.company.programmers.normal;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(new int[]{2,1,3,2},2);
    }

    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<Node> q = new LinkedList<>();

            for (int i = 0; i < priorities.length; i++) {
                if (location == i) {
                    q.add(new Node(i, priorities[i], true));

                } else {
                    q.add(new Node(i, priorities[i], false));
                }

            }


            int count = 0;
            while (!q.isEmpty()) {
                Node poll = q.poll();
                boolean flag= true;
                for (Node node : q) {
                    if (node.num >poll.num){
                        q.add(poll);
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    count++;
                    if(poll.location){
                        return count;
                    }
                }
            }


            return answer;
        }
    }

    public static class Node {
        int index;
        int num;
        boolean location;

        public Node(int index, int num, boolean location) {
            this.index = index;
            this.num = num;
            this.location = location;
        }

        public int getIndex() {
            return index;
        }

        public int getNum() {
            return num;
        }

        public boolean isLocation() {
            return location;
        }
    }
}
