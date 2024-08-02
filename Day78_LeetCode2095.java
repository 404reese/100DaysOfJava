/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }

        ListNode fast = head ;
        ListNode slow = head ;
        ListNode pre = slow ;

        while(fast!=null && fast.next!=null){
            pre = slow ;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = pre.next.next;
        return head ;
    }
}
