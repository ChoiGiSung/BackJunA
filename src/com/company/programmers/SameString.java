package com.company.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

public class SameString {

    class Solution {
        public int solution(String s) {
            int answer = 0;
            ArrayList<Integer> result = new ArrayList<>();

            if(s.length() == 1){
                return 1;
            }

            for (int i = 1; i <= s.length()/2; i++) {
                String copy = s;
                String resultString = "";


                while (copy.length() != 0) {
                    if(i > copy.length()){
                        resultString+=copy;
                        break;
                    }

                    int count = 1;
                    String get = copy.substring(0, i);
                    copy = copy.substring(i, copy.length());

                    while (copy.startsWith(get)) {
                        count++;
                        copy = copy.substring(i,copy.length());
                    }
                    if(count != 1){
                        resultString+=count+get;
                    }else {
                        resultString+=get;
                    }

                }
                result.add(resultString.length());
            }
            return Collections.min(result);
        }
    }

    @Test
    public void  sample(){
        Solution solution = new Solution();
        int get = solution.solution("a");
        System.out.println(get);
//        Assertions.assertEquals();
    }
}
