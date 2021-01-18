/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) { 
        if(head == null) return true;
        
        //find mid of the LL
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode head2 = slow.next;
        slow.next=null;
        
        //reverse the 2nd LL
        ListNode curr =head2;
        ListNode next;
        ListNode prev = null;
        while(curr !=null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head2 = prev;
        
        //iterate ad check
        while(head !=null && head2 !=null){
            if(head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        
        return true;
        
    }
}
