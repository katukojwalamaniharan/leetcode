class Solution {
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode mid = null;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast == null){
            mid = prev;
        }else{
            mid = slow;
        }
        ListNode second = mid.next;
        second = reverse (second);
        ListNode temp = head;
        while(second != null){
            int a = temp.val;
            int b = second.val;
            if(a != b) return false;
            temp = temp.next;
            second = second.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}