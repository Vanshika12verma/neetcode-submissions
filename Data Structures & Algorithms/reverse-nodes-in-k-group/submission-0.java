class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp!=null && size<k) {
            size++;
            temp = temp.next;
        }
        if (size<k) return head;
        ListNode prev = null, curr = head;
        for (int i=0; i<k; i++) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}
