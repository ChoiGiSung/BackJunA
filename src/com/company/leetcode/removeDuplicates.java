//package com.company.leetcode;
//
//public class removeDuplicates {
//}
//
//class Solution2 {
//    boolean flag=true;
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head== null)
//            return null;
//        else if (head.next == null){
//            return head;
//        }
//        ListNode sampleNode=head;
//        while (sampleNode != null){
//            System.out.println(sampleNode.val);
//
//            ListNode nowNode=sampleNode;
//            if(sampleNode.next ==null){
//                break;
//            }
//            sampleNode=delete(nowNode,nowNode.next);
//            if (flag){
//                sampleNode=sampleNode.next;
//            }
//        }
//        return head;
//    }
//    public ListNode delete(ListNode nowNode,ListNode nextNode){
//        if(nowNode.val == nextNode.val){
//            nowNode.next=nextNode.next;
//            flag=false;
//            return nowNode;
//        }
//        flag=true;
//        return nowNode;
//    }
//}
//
//
//
//class ListNode {
//    int val;
//    ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
