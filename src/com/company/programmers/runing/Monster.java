package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Monster {

    @Test
    void test() {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{4, 9, 5, 8}, 2, 3, 4);
        System.out.println(solution1);
    }

    public class Solution {
        public int solution(int[] monster, int S1, int S2, int S3) {
            int answer = 1;
            double totalCount = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 1; i <= S1; i++) {
                for (int j = 1; j <= S2; j++) {
                    for (int k = 1; k <= S3; k++) {
                        int result = i + j + k;
                        map.put(result, map.getOrDefault(result, 0) + 1);
                        totalCount++;
                    }
                }
            }

            for (int i : monster) {
                answer += map.getOrDefault(i, 0);
            }

            answer = (int) Math.floor((totalCount - answer / totalCount) * 1000);

            return answer;
        }
    }
}
