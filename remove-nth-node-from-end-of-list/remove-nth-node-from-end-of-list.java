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
    //two pass algorithm
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int count=0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        ListNode dummy = new ListNode(0,head);
        
        count =count -(n);
        curr=dummy;
        while(count >0){
            count--;
            curr = curr.next;
        }
        curr.next= curr.next.next;
        return dummy.next;
    }
}