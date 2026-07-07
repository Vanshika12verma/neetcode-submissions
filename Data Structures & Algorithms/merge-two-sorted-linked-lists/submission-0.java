class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headA = list1;
        ListNode headB = list2;
        ListNode temp = new ListNode(-100);
        ListNode a = temp;
        while (headA!=null && headB!=null){
            if (headA.val<headB.val) {
                a.next = new ListNode(headA.val);
                a = a.next;
                headA = headA.next;
            }
            else {
                a.next = new ListNode(headB.val);
                a = a.next;
                headB = headB.next;
            }
        }
        while (headA!=null) {
            a.next = new ListNode(headA.val);
            a = a.next;
            headA = headA.next;
        }
        while (headB!=null) {
            a.next = new ListNode(headB.val);
            a = a.next;
            headB = headB.next;
        }
        return temp.next;
    }
}