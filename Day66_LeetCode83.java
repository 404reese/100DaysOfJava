class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode  ans = dummy ;

        ListNode ptr = head.next ;

        while(ptr!=null){
            if(ptr.val!=dummy.val){
                dummy.next = ptr ;
                dummy = dummy.next;
            }
            ptr = ptr.next;
        }
        dummy.next = null; 
        return ans ;
    }
}