package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Game {

    @Test
    void test(){
        Solution solution = new Solution();
        solution.solution(new int[]{200, 120, 150},new int[][]{{30, 100},{500, 30},{100,400}});
    }

    class Solution {
        public int[] solution(int[] healths, int[][] items) {
            int[] answer;
            List<Potion> result = new ArrayList<>();


            Queue<Integer> healList = new PriorityQueue<>(Collections.reverseOrder());
            for (int i : healths) {
                healList.add(i);
            }

            Queue<Potion> potionList = new PriorityQueue<>(Collections.reverseOrder( (o1, o2) -> {
                if(o1.heal > o2.heal){
                    return -1;
                }else if(o1.heal < o2.heal){
                    return 1;
                }else {
                    return 0;
                }
            }));

            for (int i = 0; i < items.length; i++) {
                int[] item = items[i];
                int heal = item[0];
                int damage = item[1];
                potionList.add(new Potion(i,heal,damage));

            }


            while (!potionList.isEmpty() && !healList.isEmpty()){
                Integer healPeek = healList.peek();
                Potion potionPeek = potionList.peek();

                if(healPeek - potionPeek.damage >= 100){
                    Potion potion = potionList.poll();
                    result.add(potion);
                    healList.add(healList.poll() - potion.damage);
                }else {
                    potionList.poll();
                }

            }
            Collections.sort(result);
            answer = new int[result.size()];

            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i).index + 1;
            }

            return answer;
        }

        class Potion implements Comparable<Potion>{
            int index;
            int heal;
            int damage;

            public Potion(int index,int heal, int damage) {
                this.index = index;
                this.heal = heal;
                this.damage = damage;
            }

            @Override
            public int compareTo(Potion o) {
                if(this.index > o.index){
                    return 1;
                }else {
                    return -1;
                }
            }
        }
    }
}
