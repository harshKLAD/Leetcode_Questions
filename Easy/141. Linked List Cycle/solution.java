/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> set = new HashMap<ListNode, Integer>();
        ListNode current = new ListNode(0);
        current = head;
        int p = 0;

        if (current == null) {
            return false;
        } else {
            set.put(current, p);
            p++;

            while (set.containsKey(current.next) == false) {

                set.put(current.next, p);
                current = current.next;
                if (current == null) {
                    return false;
                }
            }
            return true;
        }
    }
}