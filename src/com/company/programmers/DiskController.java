package com.company.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiskController {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //3, [[0, 3], [4, 3], [8, 3]]
        int solution1 = solution.solution(new int[][]{{0,3},{4,3},{8,3}});
        System.out.println(solution1);
    }

    static class Solution {
        public int solution(int[][] jobs) {
            int answer = 0;
            List<Node> ar = new ArrayList<>();
            List<Node> result = new ArrayList<>();
            for (int[] job : jobs) {
                ar.add(new Node(job[0],job[1]));
            }
            Collections.sort(ar);

            int endTime = 0;
            Node node = ar.get(0);
            ar.remove(0);


            node.total = node.running - endTime;
            endTime += node.start + node.running;

            result.add(node);

            while (!ar.isEmpty()){
                Node thisNode = new Node(10001,10001);
                boolean flag = false;
                for (Node node1 : ar) {
                    if(node1.start <= endTime){
                        if(thisNode.running > node1.running){
                            thisNode = node1;
                            flag = true;
                        }
                    }
                }
                if(flag){
                    ar.remove(thisNode);
                    thisNode.total = thisNode.running + endTime - thisNode.start;
                    endTime += thisNode.running;

                    result.add(thisNode);
                }else {
                    endTime++;
                }
            }


            for (Node node1 : result) {
                answer+=node1.getTotal();
            }

            return answer/ jobs.length;
        }
    }

    static class Node implements Comparable<Node>{
        int start;
        int running;
        int total = 0;

        public Node(int start, int running) {
            this.start = start;
            this.running = running;
        }

        public int getStart() {
            return start;
        }

        public int getRunning() {
            return running;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        @Override
        public int compareTo(Node o) {
            if(o.start == this.start){
                return this.running-o.running;
            }

            return this.start - o.start;
        }
    }
}
