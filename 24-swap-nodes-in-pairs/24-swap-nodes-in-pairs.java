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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null)
            return head;
        ListNode sentinal = new ListNode(0, head);
        ListNode curr = head;
        ListNode front = head.next;
        ListNode prev = sentinal;
        while(curr.next != null){
            curr.next = front.next;
            front.next = curr;
            prev.next = front;
            if(curr.next == null)
                break;
            prev = curr;
            curr = curr.next;
            front = curr.next;
        }
        return sentinal.next;
        
    }
}