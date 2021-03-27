package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class GymSuit {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(5,new int[]{2,4,5},new int[] {1,4});
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int count = 0;

            count = n - lost.length;

            List<Integer> lostList = new ArrayList<>();
            List<Integer> reserveList = new ArrayList<>();

            for (int i : lost) {
                lostList.add(i);
            }
            for (int i : reserve) {
                reserveList.add(i);
            }

            for (int i = 0; i < lostList.size(); i++) {
                if(reserveList.contains(lostList.get(i))){
                    reserveList.set(reserveList.indexOf(lostList.get(i)),1000);
                    lostList.set(i,-1000);
                    count++;
                }
            }

            for (int i = 0; i < lostList.size(); i++) {
                if(checkGymSuit(lostList.get(i),reserveList) == 1){
                    count++;
                }
            }


            System.out.println(count);

            return count;

        }

        private int checkGymSuit(int i, List<Integer> reserveList) {
            for (int j = 0; j < reserveList.size(); j++) {
                if(i == reserveList.get(j)-1 ||i == reserveList.get(j)+1 ){
                    reserveList.remove(j);
                    return 1;
                }
            }
            return 0;
        }


    }
}
