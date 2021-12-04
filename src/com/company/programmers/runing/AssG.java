package com.company.programmers.runing;

import java.util.*;

public class AssG {

    class Solution {
        public boolean solution(String a, String b) {

            Map<String, Integer> map = new HashMap<>();
            String[] stringsA = a.split("");
            for (String string : stringsA) {
                String upperCase = string.toUpperCase();
                map.put(upperCase, map.getOrDefault(upperCase, 0) + 1);
            }

            String[] stringsB = b.split("");
            for (String string : stringsB) {
                String upperCase = string.toUpperCase();

                if (map.containsKey(upperCase)) {
                    int getInt = map.get(upperCase) - 1;
                    if (getInt == 0) {
                        map.remove(upperCase);
                    } else {
                        map.put(upperCase,getInt);
                    }
                }else {
                    return false;
                }
            }

            return map.isEmpty();
        }
    }
}
