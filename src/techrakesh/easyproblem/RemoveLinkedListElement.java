package techrakesh.easyproblem;

public class RemoveLinkedListElement {
    ListNode head;

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper=new ListNode(0);
        helper.next=head;
        ListNode current=helper;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }
            else
                current=current.next;
        }
        return helper.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElement linkedList=new RemoveLinkedListElement();
        linkedList.head = new ListNode(2);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        second.next = third;
        linkedList.head.next = second;
        linkedList.head=linkedList.removeElements(linkedList.head,2);
        linkedList.printList();
    }
    private void printList() {
        ListNode n = head;
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}
