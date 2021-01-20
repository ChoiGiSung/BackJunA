package com.company.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest {

    class Solution {
        public int[] solution(int[] answers) {

            int[] One={1, 2, 3, 4, 5};
            int[] Two={2, 1, 2, 3, 2, 4, 2, 5};
            int[] Three={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int OneResult = 0 ,TwoResult = 0 ,ThreeResult = 0 ;
            for (int i = 0; i < answers.length; i++) {
                int get=answers[i];
                if(One[i% One.length] == get)
                    OneResult++;
                if(Two[i% Two.length] == get)
                    TwoResult++;
                if(Three[i% Three.length] == get)
                    ThreeResult++;

            }

            int result=Math.max(OneResult,Math.max(TwoResult,ThreeResult));

            ArrayList<Integer> Ar=new ArrayList<>();
            if(result == OneResult){
                Ar.add(1);
            }
            if(result == TwoResult){
                Ar.add(2);
            }
            if(result == ThreeResult){
                Ar.add(3);
            }
            int [] answer=new int[Ar.size()];

            for (int i = 0; i < Ar.size(); i++) {
                answer[i]=Ar.get(i);
            }
            return answer;
        }
    }
}
