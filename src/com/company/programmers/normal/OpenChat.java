package com.company.programmers.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {

    class Solution {
        public String[] solution(String[] record) {

            Map<String,String> map = new HashMap<>();
            List<String> result = new ArrayList<>();

            for (String s : record) {
                String[] strings = s.split(" ");
                if(strings[0].equals("Enter") || strings[0].equals("Change")){
                    String id = strings[1];
                    String name = strings[2];

                    map.put(id,name);
                }

            }

            for (String s : record) {
                String[] strings = s.split(" ");
                if (strings[0].equals("Enter")){
                    String id = strings[1];
                    String name = map.get(id);
                    result.add(name+"님이 들어왔습니다.");
                }else if(strings[0].equals("Leave")){
                    String id = strings[1];
                    String name = map.get(id);
                    result.add(name+"님이 나갔습니다.");
                }

            }

            String[] answer = new String[result.size()];

            result.toArray(answer);
            return answer;
        }
    }
}
