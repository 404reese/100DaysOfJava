/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode fast = head ;
        ListNode slow = head ;
        ListNode ptr = head ;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow==fast){ // there is a cycle in ll

                while(ptr!=slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr ;
            }
        }

        return null;
    }
}
