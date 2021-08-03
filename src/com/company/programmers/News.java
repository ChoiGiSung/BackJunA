package com.company.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class News {

    @Test
    void sample(){
        Solution solution = new Solution();
        int aaaa12 = solution.solution("handshake", "shake hands");
        System.out.println(aaaa12);
    }

    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;
            List<String> st1 = new ArrayList<>();
            List<String> st2 = new ArrayList<>();
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            setList(str1, st1);
            setList(str2, st2);

            int same = 0;
            int all = st2.size();

            if(st1.size() == 0 && st2.size() ==0){
                return 65536;
            }

            for (String string : st1) {
                if(st2.remove(string)){
                    same++;
                }else {
                    all++;
                }
            }

            return (int) ((same/(double)all)*65536);
        }

        private void setList(String str1, List<String> st1) {
            for (int i = 0; i < str1.length() - 1; i++) {
                StringBuilder builder = new StringBuilder();
                char first = str1.charAt(i);
                char second = str1.charAt(i + 1);

                if (first < 'a' || second < 'a'
                        || first > 'z' || second > 'z') {
                    continue;
                }
                builder.append(first).append(second);
                st1.add(builder.toString());
            }
        }
    }
}
