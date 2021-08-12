package com.company.backjun.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MutualEvaluation {

    @Test
    void test(){
        Solution solution = new Solution();
        String solution1 = solution.solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}});
        System.out.println(solution1);
    }

    class Solution {
        public String solution(int[][] scores) {
            String answer = "";
            List<Integer> result  = new ArrayList<>();

            for (int i = 0; i < scores.length; i++) {
                int[] score = scores[i];
                int self = score[i];

                Integer[] myScore = getMyScore(i,scores);
                if(checkMax(self,myScore) ||checkMin(self,myScore)){
                    //자기 자신 빼고 result에 넣기
                    result.add(selfOut(i,myScore));
                    continue;
                }
                result.add(selfIn(myScore));
            }

            StringBuilder builder = new StringBuilder();
            for (Integer integer : result) {
                builder.append(checkCredit(integer));
            }

            return builder.toString();
        }

        private Integer[] getMyScore(int i, int[][] scores) {
            List<Integer> collect = Arrays.stream(scores).map(ints -> ints[i]).collect(Collectors.toList());
            Integer[] integers = collect.toArray(new Integer[collect.size()]);
            return integers;
        }

        private String checkCredit(int input) {
            if(input >= 90){
                return "A";
            }else if(input >= 80){
                return "B";
            }else if(input >= 70){
                return "C";
            }else if(input >= 50){
                return "D";
            }else{
                return "F";
            }
        }

        private int selfIn(Integer[] score) {
            int sum = 0;
            for (int j = 0; j < score.length; j++) {
                sum += score[j];
            }
            return sum/score.length;
        }

        private int selfOut(int i, Integer[] score) {
            int sum = 0;
            for (int j = 0; j < score.length; j++) {
                if(i == j){
                    continue;
                }
                sum += score[j];
            }
            return sum/(score.length-1);
        }

        private boolean checkMin(int self, Integer[] score) {
            int min = score[0];
            int count = 1;
            for (int i = 1; i < score.length; i++) {
                if(min > score[i]){
                    min = score[i];
                    count = 1;
                }else if(min == score[i]){
                    count++;
                }
            }

            if(min == self && count == 1){
                return true;
            }
            return false;
        }

        private boolean checkMax(int self, Integer[] score) {
            int max = score[0];
            int count = 1;
            for (int i = 1; i < score.length; i++) {
                if(max < score[i]){
                    max = score[i];
                    count = 1;
                }else if(max == score[i]){
                    count++;
                }
            }

            if(max == self && count == 1){
                return true;
            }
            return false;
        }
    }

}
