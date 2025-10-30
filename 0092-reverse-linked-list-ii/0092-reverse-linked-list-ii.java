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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }
        ListNode newTail = prev.next;
        ListNode start = prev.next;
        ListNode next = start.next;
        // prev.next = null;
        ListNode previous = null;
        for(int i=0;i<=right-left;i++){
            start.next=previous;
            previous=start;
            start=next;
            if(next!=null)
                next = next.next;
        }
        prev.next = previous;
        newTail.next = start;
        return dummy.next;
    }
}