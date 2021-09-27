package com.company.programmers.normal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewId {

    public static void main(String[] args) {
        Solution.solution("abcdefghijklmn.p");
    }

    static class Solution {
        public static String solution(String new_id) {
            String answer = "";
            Pattern pat = Pattern.compile("[^0-9a-z-_.]");


            //1
            answer = new_id.toLowerCase();

            //2
            Matcher m = pat.matcher(answer);
            answer = m.replaceAll("");

            //3
            answer = answer.replaceAll("[.]{2,}",".");

            //4
            if(answer.startsWith(".")){
                answer=answer.substring(1,answer.length());
            }
            if (answer.endsWith(".")){
                answer=answer.substring(0,answer.length()-1);
            }

            //5
            if (answer.equals("")){
                answer="a";
            }

            //6
            if(answer.length() >= 16){
                answer = answer.substring(0,15);
            }
            if(answer.startsWith(".")){
                answer=answer.substring(1,answer.length());
            }
            if (answer.endsWith(".")){
                answer=answer.substring(0,answer.length()-1);
            }

            //7
            if(answer.length() <= 2){
                while (answer.length() <3){
                    answer += answer.substring(answer.length()-1,answer.length());
                }
            }

            return answer;
        }
    }
}
