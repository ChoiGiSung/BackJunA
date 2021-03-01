package com.company.leetcode;

public class removeDuplicates {
    class ListNode2{
        int val;
    }
    static class ListNode3{
        int val;
    }

}

class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nowNode = head;

        while (nowNode !=null && nowNode.next != null) {
            if (nowNode.val == nowNode.next.val)
                nowNode.next = nowNode.next.next;
            else nowNode = nowNode.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
