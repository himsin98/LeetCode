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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null)
            return head;
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        ListNode[] arr = new ListNode[len];
        curr = head;
        while(curr!=null){
            arr[--len] = curr;
            curr = curr.next;
        }
        Arrays.sort(arr, (a,b) -> a.val-b.val);
        head = arr[0];
        curr = head;
        for(ListNode n: arr){
            curr.next = n;
            curr = curr.next;
        }
        curr.next = null;
        return head;
        
    }
}