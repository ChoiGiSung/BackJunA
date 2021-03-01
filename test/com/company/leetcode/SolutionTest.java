package com.company.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();
    Solution2 solution2=new Solution2();
    palindromeNumber palindromeNumber=new palindromeNumber();
//    linkedListCycle linkedListCycle=new linkedListCycle();
    longestCommon longestCommon=new longestCommon();

    removeDuplicates removeDuplicates=new removeDuplicates();
    //중첩클래스는 이렇게 사용 인스턴스 클래스 사용 위의 객체를 통해 접근해야함
    removeDuplicates.ListNode2 listNode2= removeDuplicates.new ListNode2();
    //중첩클래스 (클래스) 정적 클래스
    removeDuplicates.ListNode3 listNode3=new removeDuplicates.ListNode3();
    
    @Test
    public void  sam(){
        Assertions.assertEquals(-21,solution.reverse(-12));
    }
    @Test
    public void  연결삭제(){
        solution2.deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(3,new ListNode(3))))))));
    }
    @Test
    public void  뒤집기(){
        Assertions.assertEquals(true,palindromeNumber.isPalindrome(121)) ;
    }
  //  @Test
//    public void  원형검사(){
//        ListNode listNode=new ListNode(1);
//        ListNode listNode2=new ListNode(2);
//        ListNode listNode3=new ListNode(3);
//        ListNode listNode4=new ListNode(4);
//
//        listNode.next=listNode2;
//        listNode2.next=listNode3;
//        listNode3.next=listNode4;
//        listNode4.next=listNode;
//
//        Assertions.assertEquals(true,linkedListCycle.hasCycle(listNode));
//    }

    @Test
    public void  단어검사(){
        Assertions.assertEquals("fl",longestCommon.longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }

}