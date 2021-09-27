package com.company.programmers.normal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneTwoThreeWorld {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution(12);
        System.out.println(solution1);
    }

    static class Solution {
        public String solution(int n) {
            String answer = "";

            Map<String,String> map = new HashMap();
            String[] array = {"0","1","2","4","11","12","14","21","22","24","41"};
            for (int i = 1; i <=10; i++) {
                 map.put(String.valueOf(i),array[i]);
            }

            String[] nStr = String.valueOf(n).split("");

            StringBuilder builder = new StringBuilder();
            for (String str : nStr) {
                if(str.equals("0")){
                    if(nStr.length == 1){
                        return "41";
                    }
                    builder.delete(builder.length()-1,builder.length());
                    builder.append(map.get("10"));
                    continue;
                }
                builder.append(map.get(str));
            }
            return builder.toString();
        }
    }
}
