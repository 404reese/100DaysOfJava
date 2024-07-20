class Solution {
    public ListNode reverseLL(ListNode head){
        ListNode curr = head ;
        ListNode pre = null ;

        while(curr!=null){
            ListNode temp = curr.next ;
            curr.next = pre ;
            pre = curr ;
            curr = temp ;
        }
        return pre ;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode nhead = reverseLL(head);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;
        int carry = 0 ;

        while(nhead!=null){

            int sum = nhead.val  + nhead.val + carry ;
            int d = sum%10 ;
            carry = sum/10 ;
            ListNode temp = new ListNode(d);
            dummy.next = temp ;
            dummy = dummy.next ;
            nhead= nhead.next ;
        }

        if(carry>0){
           ListNode temp = new ListNode(carry);
            dummy.next = temp ;
        }
        ans = reverseLL(ans.next);
        return ans ;
    }
}