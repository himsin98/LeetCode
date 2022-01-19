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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
        	return;
    	ListNode slow = head, fast = head;
    	while (fast.next != null && fast.next.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	ListNode node = slow.next, evenHead = null;
    	slow.next = null;
    	while (node != null) {
    		ListNode tmp = node;
    		node = node.next;
    		tmp.next = evenHead;
    		evenHead = tmp;
    	}
    	for (node = head; evenHead != null; node = node.next.next) {
    		ListNode insertNode = evenHead;
    		evenHead = evenHead.next;
    		insertNode.next = node.next;
    		node.next = insertNode;
    	}
    }
}