package com.company.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FailureRate {

    public static void main(String[] args) {
        Solution.solution(5,new int[]{1,2,2,1,3});
    }

    static class Solution {

        public static int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            int allPeople = stages.length;
            Arrays.sort(stages);
            int[] people = getPeple(N, stages, answer);

            List<People> result = new ArrayList<>();

            for (int i = 0; i < people.length; i++) {
                double fail = people[i] / (double) allPeople;
                if(Double.isNaN(fail)){
                    result.add(new People(i+1,0.0));
                    allPeople -= people[i];
                    continue;
                }
                result.add(new People(i+1,fail));

                allPeople -= people[i];

            }


            Collections.sort(result);

            List<Integer> collect = result.stream().map(People::getIndex).collect(Collectors.toList());

            Integer[] integers = collect.toArray(new Integer[0]);
            int [] rsesult = new int[integers.length];
            for (int i = 0; i < integers.length; i++) {
                rsesult[i] = integers[i];
            }

            return rsesult;
        }

        private static int[] getPeple(int N, int[] stages, int[] answer) {
            int index = 0;
            for (int i = 1; i <= N; i++) {

                int count = 0;
                for (int j = index; j < stages.length; j++) {
                    if(stages[j] ==i ){
                        count ++;
                    }else {
                        index = j;
                        break;
                    }
                }
                answer[i-1] = count;

            }

            return answer;
        }

        public static class People implements Comparable<People>{
            int index = 0;
            double fail= 0;

            public People(int index, double fail) {
                this.index = index;
                this.fail = fail;
            }

            public int getIndex() {
                return index;
            }

            public double getFail() {
                return fail;
            }

            @Override
            public int compareTo(People o) {
                if(this.fail == o.fail){
                    return Integer.compare(this.getIndex(), o.getIndex());
                }
                return -Double.compare(this.fail, o.fail);

            }
        }
    }
}
