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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        return recursion(head);
    }
    private ListNode recursion(ListNode head){
        ListNode current = new ListNode();

        if(head == null || head.next == null) return head;
        ListNode newhead = recursion(head.next);
        head.next.next = head;
        head.next = null;        
        return newhead;
    }
    
    
}