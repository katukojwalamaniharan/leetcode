class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while(canTraverseK(prev, k)){   // <-- cleaner contract
            ListNode node = prev;
            for(int i=0;i<k;i++){
                node = node.next;
            }

            ListNode groupStart = prev.next;
            ListNode nextGroupHead = node.next;

            ListNode cur = groupStart;
            ListNode prevNode = nextGroupHead;

            for(int i=0;i<k;i++){
                ListNode next = cur.next;
                cur.next = prevNode;
                prevNode = cur;
                cur = next;
            }

            prev.next = prevNode;
            prev = groupStart;
        }

        return dummy.next;
    }

    private boolean canTraverseK(ListNode node, int k){
        for(int i=0;i<k;i++){
            node = node.next;
            if(node == null) return false;
        }
        return true;
    }
}
