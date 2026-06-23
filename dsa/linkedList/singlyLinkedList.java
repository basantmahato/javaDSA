package dsa.linkedList;

public class singlyLinkedList {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        System.out.println("Singly Linked List initialized. Head: " + list.head);
    }
}
