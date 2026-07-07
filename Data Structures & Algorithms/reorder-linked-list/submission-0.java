class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (curr != null) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        ListNode t1 = head, t2 = prev;
        while (t1 != null && t2 != null) {
            ListNode after1 = t1.next;
            ListNode after2 = t2.next;
            t1.next = t2;
            t2.next = after1;
            t1 = after1;
            t2 = after2;
        }
    }
}