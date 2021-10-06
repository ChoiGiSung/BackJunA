package com.company.programmers.week;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Week6 {

    @Test
    void sample(){
        Solution solution = new Solution();
        solution.solution(new int[]{60, 70, 60},new String[]{"NNN", "NNN", "NNN"});
    }

    class Solution {
        public int[] solution(int[] weights, String[] head2head) {
            int[] answer;
            List<Node> fighters = new ArrayList<>();

            for (int i = 0; i < weights.length; i++) {
                Node fighter = new Node(i, weights[i]);
                fighters.add(fighter);
                String total = head2head[i];
                checkTotalFight(fighter,total,weights);
            }

            Collections.sort(fighters);
            List<Integer> collect = fighters.stream().map(Node::getIndex).collect(Collectors.toList());
            answer = new int[collect.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = collect.get(i);
            }
            return answer;
        }

        private void checkTotalFight(Node fighter, String total,int[]weights) {
            char[] chars = total.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(!fighter.isMe(i) && chars[i] == 'W'){
                    fighter.addWin(weights[i]);
                    fighter.totalPlus();
                }else if(chars[i] == 'L'){
                    fighter.totalPlus();
                }
            }
        }

        class Node implements Comparable<Node>{
            int index;
            int weight;
            int win;
            int heavyWin;
            int totalMatch;

            public Node(int index, int weight) {
                this.index = index;
                this.weight = weight;
            }

            public int getWeight() {
                return weight;
            }

            public boolean isMe(int i) {
                return index == i;
            }

            public void addWin(int weight) {
                win++;
                if(this.weight < weight){
                    heavyWin++;
                }
            }

            public int getIndex() {
                return index+1;
            }

            public double getWiningRate(){
                return (double) win/totalMatch;
            }

            public void totalPlus(){
                totalMatch++;
            }

            @Override
            public int compareTo(Node o) {
                double winingRate = this.getWiningRate();
                double winingRate1 = o.getWiningRate();
                if(this.getWiningRate() == o.getWiningRate()){
                    if(this.heavyWin == o.heavyWin){
                        if(this.weight == o.weight){
                            return Integer.compare(this.index,o.index);
                        }
                        return Integer.compare(o.weight,this.weight);
                    }
                    return Integer.compare(o.heavyWin,this.heavyWin);
                }
                return Double.compare(o.getWiningRate(),this.getWiningRate());

            }
        }
    }
}
