package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    @Test
    void test(){
        Solution solution = new Solution();
        String solution1 = solution.solution(new int[]{3, 30, 34, 5, 9});
        System.out.println(solution1);
    }

    class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            List<String> list = new ArrayList<>();

            for (int number : numbers) {
                list.add(number+"");
            }

            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2 + o1).compareTo(o1 + o2);
                }
            });
            for (String s : list) {
                answer+=s;
            }
            return answer;
        }
    }
}
