package com.company.programmers;

public class StrangeWord {
    class Solution {
        public String solution(String s) {
            String answer = "";
            char[] getChar = s.toCharArray();

            StringBuilder stringBuilder = new StringBuilder();

            String[] s1 = s.split("");
            int count=0;
            //단어별 짝 홀
            for (int i = 0; i < getChar.length; i++) {

                if(s1[i].equals(" ")){
                    stringBuilder.append(' ');
                    count=0;
                    continue;
                }
                if(count%2==0){
                    stringBuilder.append(s1[i].toUpperCase());
                    count++;
                }else {
                    stringBuilder.append(s1[i].toLowerCase());
                    count++;
                }

            }
            answer=stringBuilder.toString();
            return answer;
        }
    }
}
