package dsa.linkedList;

public class doublyLinkedList {
    
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        System.out.println("Doubly Linked List initialized. Head: " + list.head);
    }
}
