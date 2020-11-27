/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String out = "";

        while (true) {
            out = out + Integer.toString(head.val);
            head = head.next;
            if (head == null) {
                break;
            }
        }
        // System.out.println(out);
        return Integer.parseInt(out, 2);
    }
}