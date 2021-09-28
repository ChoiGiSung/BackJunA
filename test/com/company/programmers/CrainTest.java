//package com.company.programmers;
//
//import com.company.programmers.normal.Crain;
//import com.company.programmers.normal.KNumber;
//import com.company.programmers.normal.PracticeTest;
//import com.company.programmers.normal.StrangeWord;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class CrainTest {
//
//    Crain crain = new Crain();
//
//    @Test
//    public void craintest() {
//        Crain.Solution solution = crain.new Solution();
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2},
//                {3, 5, 1, 3, 1
//                }};
//        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//
//        Assertions.assertEquals(4,solution.solution(board, moves));
//    }
//
//    @Test
//    public void Practice(){
//        PracticeTest practiceTest=new PracticeTest();
//        PracticeTest.Solution solution= practiceTest.new Solution();
//
//        int []answers={1,2,3,4,5};
//        solution.solution(answers);
//    }
//
//    @Test
//    public void Strange(){
//        StrangeWord strangeWord=new StrangeWord();
//        StrangeWord.Solution solution= strangeWord.new Solution();
//
//        String answers="  try hello world  ";
//        Assertions.assertEquals("  TrY HeLlO WoRlD  ",solution.solution(answers));
//    }
//
//    @Test
//    public void KNum(){
//        KNumber kNumber=new KNumber();
//        KNumber.Solution solution= kNumber.new Solution();
//
//        int []array= {1, 5, 2, 6, 3, 7, 4};
//        int [][]commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        Assertions.assertEquals(new int[]{5,6,3},solution.solution(array,commands));
//    }
//}