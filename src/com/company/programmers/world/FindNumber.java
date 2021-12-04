package com.company.programmers.world;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }

            for (int number : numbers) {
                list.remove(Integer.valueOf(number));
            }

            answer = list.stream().reduce(0,Integer::sum);
            return answer;
        }
    }
}
