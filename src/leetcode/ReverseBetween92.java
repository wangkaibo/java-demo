package leetcode;

import java.util.List;

public class ReverseBetween92 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
         // 1 -> c -> n —> 4 -> 5 -> 6
         // 1 -> 2 -> 3 —> 4 -> 5 -> 6
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        ListNode current = pre.next;
        for (int j = left; j < right; j++) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return fakeHead.next;
    }
}
