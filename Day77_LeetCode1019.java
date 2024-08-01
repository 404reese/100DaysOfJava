class Solution {
    public int sizeLL(ListNode head){
        ListNode curr = head ;
        int count = 0 ;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count ;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr = head ;
        ListNode pre = null ;

        while(curr!=null){
            ListNode temp = curr.next;

            curr.next = pre ;
            pre = curr ;
            curr = temp ;
        }
        return pre ;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode nHead = reverseLL(head);

        Stack<Integer> st = new Stack<>();
        st.push(nHead.val);
        ListNode curr = nHead.next;
        int ptr = size-2 ;

        while(ptr>=0){

            int ele = curr.val;
            curr = curr.next;

            // check and pop
            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }

            // put in array
            if(st.size()==0){
                arr[ptr] = 0 ;
            }else{
                arr[ptr]= st.peek();
            }
            // push ele in stack
            st.push(ele);
            ptr--;
        }
        return arr ;
    }
}
