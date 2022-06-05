package MS.JavaAlgorithms.LinkedList.Reverse;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}