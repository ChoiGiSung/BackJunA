package com.company.programmers.runing;

import java.util.Arrays;
import java.util.Comparator;

public class Wrong1 {

    class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            int length = numbers.length;
            String[] str = new String[length];

            for (int i = 0; i < length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(str, new Comparator<String>() {
                public int compare(String a, String b) {
                    return (b+a).compareTo(a + b);
                }
            });

            for (int i = 0; i < str.length; i++) {
                answer += str[i];
            }

            if(answer.startsWith("0")){
                return "0";
            }

            return answer;
        }
    }
}
