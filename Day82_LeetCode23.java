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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 ){
            return null;
        }else if ( lists.length == 1){
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0;i<lists.length;i++){
            ListNode temphead = lists[i];
            while(temphead!=null){
                pq.add(temphead);
                temphead=temphead.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;

        while(pq.size()>0){
            ListNode node = pq.remove();
            dummy.next = node ;
            dummy = dummy.next;
        }
        dummy.next = null;
        return ans.next;
    }
}
