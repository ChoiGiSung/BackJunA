package com.company.programmers.normal;

public class Dart {

    public static void main(String[] args) {
        int solution = Solution.solution("1D2S#10S");
        System.out.println(solution);

    }

    static class Solution {

        public static int solution(String dartResult) {
            int answer = 0;
            int[] answers = new int[3];
            int index = 0;

            char[] chars = dartResult.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];

                if (aChar == 'S' || aChar == 'D' || aChar == 'T') {
                    answers[index-1] = pow(answers[index-1],aChar);
                } else if (aChar == '*' || aChar == '#') {
                    if (aChar == '#'){
                        answers[index-1] *= -1;
                    }else {

                        if (index ==1){
                            answers[index-1] *=2;
                        }else {
                            answers[index-2] *=2;
                            answers[index-1] *=2;
                        }
                    }
                } else {
                    int number = aChar - '0';

                    if (aChar == '1') {
                        if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                            number = 10;
                        }
                    }
                    if (number == 10) {
                        i += 1;
                    }
                    index++;
                    answers[index-1] = number;
                }
            }


            for (int i : answers) {
                answer += i;
            }

            return answer;
        }
        public static int pow(int number, char c) {
            switch (c) {
                case 'S':
                    break;
                case 'D':
                    number *= number;
                    break;
                case 'T':
                    number *= number * number;
                    break;
            }
            return number;
        }
    }


}
