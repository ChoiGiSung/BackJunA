package com.company.programmers.normal;

import java.util.HashMap;
import java.util.Map;

public class Leo {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String,Integer> map = new HashMap<>();

            for (String s : completion) {
                if(map.get(s) == null){
                    map.put(s,1);
                }else {
                    map.put(s,map.get(s)+1);
                }
            }

            for (String s : participant) {
                if(map.get(s) == null){
                    return s;
                }else if(map.get(s) == 0){
                    return s;
                }else if(map.get(s) != 0) {
                    map.put(s,map.get(s)-1);
                }
            }

            return answer;
        }
    }
}
