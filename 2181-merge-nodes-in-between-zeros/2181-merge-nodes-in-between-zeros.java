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
    public ListNode mergeNodes(ListNode head) {
         /*ListNode current = head.next;
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        
        int sum = 0;
        
        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                // End of a segment
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            current = current.next;
        }
        
        return newHead.next; */
        int sum=0;
        ListNode q=new ListNode(0);
        ListNode temp=q;
        ListNode l=head.next;
        while(l!=null){
                if(l.val!=0){
                    sum+=l.val;
                }
                else{
                    temp.next=new ListNode(sum);
                    temp=temp.next;
                    sum=0;
                }
                l=l.next;
        }
       
        return q.next;
    }
}
