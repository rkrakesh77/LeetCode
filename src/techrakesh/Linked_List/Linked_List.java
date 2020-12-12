package techrakesh.Linked_List;
import techrakesh.easyproblem.LinkedListAddDataToPosition;

import java.util.Scanner;

public class Linked_List {
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
        Linked_List linkedList = new Linked_List();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Data to list");
            System.out.println("2. Print Data ");
            System.out.println("3. Exit ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("1. At beginning");
                System.out.println("2. At end");
                System.out.println("3. At Specific Position ");
                int c= sc.nextInt();
                if (c==1){
                    System.out.println("Enter data to be added : ");
                    linkedList.addDataToBeginning(sc.next());
                }
                else  if (c==2){
                    System.out.println("Enter data to be added : ");
                    linkedList.addDataToEnd(sc.next());
                }
                else  if (c==3){
                    System.out.println("Enter data to be added : ");
                    String data= sc.next();
                    System.out.println("Enter Position : ");
                    int position= sc.nextInt();
                    linkedList.addDataToPosition(data,position);
                }

            } else if (choice == 2) {
                System.out.println("\nData in Linked List are : ");
                linkedList.printList();
            } else if (choice == 3) {
                System.exit(0);
            }

        }
    }

    private void addDataToPosition(String data, int pos) {
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
                    return;
                }
            }
            new_node.next = current.next;
            current.next = new_node;
        }
    }

    private void addDataToBeginning(String data) {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    //Mothod To Print the Linked List
    private void printList() {
        Node n = head;
        if (n == null)
            System.out.println("No Data To Print");
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    private void addDataToEnd(String data) {
        Node track = head;
        Node new_node = new Node(data);
        if (track == null) {
            head = new_node;
            return;
        }
        new_node.next = null;
        while (track.next != null)
            track = track.next;
        track.next = new_node;
    }


}
