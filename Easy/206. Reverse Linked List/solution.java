/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = new ListNode(0);
        prev = null;

        ListNode current = new ListNode(0);
        current = head;

        ListNode next = new ListNode(0);

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }

}