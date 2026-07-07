class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }        
        return prev;
    }
}
