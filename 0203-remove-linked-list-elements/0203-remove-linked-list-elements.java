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
    public ListNode removeElements(ListNode head, int val) {
        if( head==null){
            return null;
        }

        ListNode l1=new ListNode(0);
        l1.next=head;
        ListNode pre=l1;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==val){
              
                pre.next=temp.next;
                
            }
            else{
                pre=temp;
            }
           temp=temp.next; 
        }
        return l1.next;
    }
}