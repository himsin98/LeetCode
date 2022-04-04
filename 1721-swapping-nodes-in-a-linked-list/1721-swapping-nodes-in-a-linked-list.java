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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null)
            return head;
        int first = k;
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        ListNode temp1=head, temp2=head;
        int last = len - k + 1;
        if(last == first)
            return head;
        curr = head;
        int count = 0;
        while(curr != null){
            count++;
            if(count == k){
                temp1 = curr;
            }else if(count == last){
                temp2 = curr;
            }
            curr = curr.next;
        }
        int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp;
        return head;
    }
}