package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Spy {

    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;

            Map<String, Integer> map = new HashMap<>();

            for (String[] clothe : clothes) {
                String detail = clothe[0];
                String cloth = clothe[1];

                if (map.get(cloth) == null) {
                    map.put(cloth, 1);
                } else {
                    map.put(cloth, map.get(cloth) + 1);
                }
            }

            for (String key : map.keySet()) {
                answer *= map.get(key) + 1;
            }

            return answer - 1;
        }
    }
}
