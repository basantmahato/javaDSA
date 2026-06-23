package dsa.linkedList;

public class circularLinkedList {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        System.out.println("Circular Linked List initialized. Head: " + list.head);
    }
}
