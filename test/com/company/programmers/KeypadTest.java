package com.company.programmers;

import com.company.programmers.normal.Keypad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeypadTest {

    Keypad keypad=new Keypad();

    @Test
    public void 키패드(){
        Keypad.Solution solution= keypad.new Solution();

        int []number={0, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";

        Assertions.assertEquals("RLRLLRLLRL",solution.solution(new int[]{2, 2, 3, 4, 5, 6, 7, 8, 9, 0},"left"));
    }
}