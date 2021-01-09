/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        int countA = 0;
        
        ListNode B = headB;
        int countB = 0;
        
        while(A != null){
            countA++;
            A = A.next;
        }
        
        while(B != null){
            countB++;
            B = B.next;
        }
        
        System.out.println(countA + " "+ countB);
        
        A = headA;
        B = headB;
        
        if(countB > countA){
            for(int i = 0; i < countB-countA; i++){
                B = B.next;
            }
        }else{
            for(int i = 0; i < countA-countB; i++){
                A = A.next;
            }
        }
        
        while(A != null && B != null){
            
            if(A == B){
                return A;
            }
            
            A = A.next;
            B = B.next;
        }
        
        return null;
    }
}