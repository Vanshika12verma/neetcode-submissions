class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode head : lists) {
            if (head != null) {
                pq.offer(head);
            }
        }
        ListNode temp = new ListNode(-100);
        ListNode a = temp;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            a.next = node;
            a = a.next;
            if (node.next!=null) {
                pq.offer(node.next);
            }
        }
        return temp.next;
    }
}
