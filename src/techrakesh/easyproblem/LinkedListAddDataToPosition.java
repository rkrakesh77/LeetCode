package techrakesh.easyproblem;

import techrakesh.Linked_List.Linked_List;

import java.util.Scanner;

public class LinkedListAddDataToPosition {
    //Head Of the Node Pointing to First Node
    Node head;

    //Linked List Definition
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListAddDataToPosition l = new LinkedListAddDataToPosition();
        l.head = new Node("1");
        Node second = new Node("2");
        Node third = new Node("3");
        second.next = third;
        l.head.next = second;
        System.out.println("Enter Data To Be Added : ");
        String data = sc.next();
        System.out.println("Enter the Position");
        int pos = sc.nextInt();
        l.head = l.addData(data, pos);
        l.printList();
    }

    public Node addData(String data, int pos) {
        Node new_node = new Node(data);
        Node current = head;
        if(pos==0){
            new_node.next=head;
            head=new_node;
        }
        else {
            int index = 0;
            while (index < pos - 1) {
                index++;
                current = current.next;
                if (current==null){
                    System.out.println("Invalid Position");
                    return head;
                }
            }
            new_node.next = current.next;
            current.next = new_node;
        }
        return head;
    }

    private void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
