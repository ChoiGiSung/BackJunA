package com.company.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneNum {
    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            HashMap<String,Integer> map  = new HashMap<>();

            for (String s : phone_book) {
                map.put(s,1);
            }

            for (String s : phone_book) {
                for (int i = 0; i < s.length(); i++) {
                    String s1 = s.substring(0,i);
                    if(map.containsKey(s1)){
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
