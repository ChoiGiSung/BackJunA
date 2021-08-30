package com.company.programmers.week;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Week4 {

    class Solution {
        public String solution(String[] table, String[] languages, int[] preference) {
            String answer = "";
            Map<String,Integer> map = new HashMap<>();

            for (String s : table) {
                String[] strings = s.split(" ");
                Map<String,Integer> maps = new HashMap<>();
                for (int i = 1; i < strings.length; i++) {
                   maps.put(strings[i],6-i);
                }

                int result = 0;
                for (int i = 0; i < languages.length; i++) {
                    if(maps.get(languages[i])!=null){
                        result += maps.get(languages[i]) * preference[i];
                    }
                }

                map.put(strings[0],result);
            }

            String maxIndex = "";
            int max = 0;
            for (String s : map.keySet()) {

                if(map.get(s) >max ){
                    max = map.get(s);
                    maxIndex = s;
                }else if(map.get(s) ==max){
                    int compareTo = s.compareTo(maxIndex);
                    if(compareTo <0){
                        maxIndex = s;
                    }else if(compareTo > 0){
                        maxIndex = maxIndex;
                    }else {
                        maxIndex = maxIndex;
                    }
                }

            }

            return maxIndex;
        }
    }

    @Test
    void test(){
        Solution solution = new Solution();
        solution.solution(new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"},new String[]{"PYTHON", "C++", "SQL"},
                new int[]{7,5,5});
    }
}
