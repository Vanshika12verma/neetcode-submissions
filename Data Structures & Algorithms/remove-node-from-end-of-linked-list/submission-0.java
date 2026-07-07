class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp!=null) {
            size++;
            temp = temp.next;
        }
        if (size==n) return head.next;
        temp = head;
        int steps = size-n-1;
        for (int i=0; i<steps; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
