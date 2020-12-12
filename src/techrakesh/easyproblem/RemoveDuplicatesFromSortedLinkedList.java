package techrakesh.easyproblem;

public class RemoveDuplicatesFromSortedLinkedList {
    ListNode head;

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else
                current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLinkedList linkedList = new RemoveDuplicatesFromSortedLinkedList();
        linkedList.head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        second.next = third;
        linkedList.head.next = second;
        linkedList.deleteDuplicates(linkedList.head);
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
