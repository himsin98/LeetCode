public class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        ListNode prev = head;
        for(int i = 0; i <= index; i++){
            prev = prev.next;
        }
        return prev.val;
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode sentinel = head.next;
        head.next = node;
        node.next = sentinel;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode prev = head;
        for(int i = 0; i < size; i++){
            prev = prev.next;
        }
        prev.next = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        ListNode node = new ListNode(val);
        ListNode prev = head;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }
        ListNode sentinel = prev.next;
        prev.next = node;
        node.next = sentinel;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;
        ListNode prev = head;
        for(int i = 0; i < index; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */