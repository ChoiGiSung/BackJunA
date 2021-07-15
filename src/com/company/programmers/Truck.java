package com.company.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int solution1 = solution.solution(100, 100, new int[]{10});
        System.out.println(solution1);
    }
    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            Queue<LocalTruck> bQ = new LinkedList<>();
            Queue<LocalTruck> tQ = new LinkedList<>();
            int count = 0;

            for (int truck_weight : truck_weights) {
                tQ.add(new LocalTruck(truck_weight));
            }


            if(!tQ.isEmpty()){
                count++;
                LocalTruck poll = tQ.poll();
                poll.timePlus();
                bQ.add(poll);
            }else {
                return 0;
            }

            while (!bQ.isEmpty()){
                count++;


                if(bQ.peek().overTime(bridge_length)){
                    bQ.poll();
                }
                if(bQ.size() < bridge_length){
                    int totalWeight= 0;
                    for (LocalTruck localTruck : bQ) {
                        totalWeight+=localTruck.getWeight();
                    }


                    if(!tQ.isEmpty() &&totalWeight + tQ.peek().weight <= weight){
                        bQ.add(tQ.poll());
                    }
                }
                for (LocalTruck localTruck : bQ) {
                    localTruck.timePlus();
                }

            }

            return count;
        }

    }

    static class LocalTruck{
        int time;
        int weight;

        public LocalTruck(int weight) {
            this.time = 0;
            this.weight = weight;
        }

        public int getTime() {
            return time;
        }

        public int getWeight() {
            return weight;
        }

        public void timePlus(){
            time++;
        }
        public boolean overTime(int length){
            return length <= time;
        }
    }

}
