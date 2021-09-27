package com.company.programmers.normal;

import java.util.HashMap;
import java.util.Map;

public class NumAndString {

    public static void main(String[] args) {

    }

    class Solution {
        public int solution(String s) {
            int answer = 0;
            Map<String,String> map = new HashMap<>();
            String[] strings={"zero","one","two","three","four","five","six","seven","eight","nine"};
            for (int i = 0; i < 10; i++) {
                map.put(strings[i], String.valueOf(i));
            }

            for (String s1 : map.keySet()) {
                if(s.contains(s1)){
                    s=s.replaceAll(s1,map.get(s1));
                }
            }
            return Integer.parseInt(s);
        }
    }
}
