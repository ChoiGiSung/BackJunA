//package com.company.leetcode;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//import java.util.*;
//public class linkedListCycle {
//        public boolean hasCycle(ListNode head) {
//            if (head == null){
//                return false;
//            }else if(head.next == null){
//                return false;
//            }
//            ArrayList<ListNode> Ar=new ArrayList<>();
//            ListNode nowNode=head;
//            while (nowNode.next != null){
//                //루프가 있으면 무한 루프를 돌꺼다.
//                if(Ar.contains(nowNode) == true){
//                    return true;
//                }
//                Ar.add(nowNode);
//                nowNode=nowNode.next;
//            }
//            return false;
//        }
//
//}
//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//         next = null;
//      }
// }
//
