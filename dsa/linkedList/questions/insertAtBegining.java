package dsa.linkedList.questions;

public class insertAtBegining {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node insert(node head, int newData) {

        node newNode = new node(newData);

        newNode.next = head;

        return newNode;
    }

    public static void main(String[] args) {
        node head = null;

        head = insert(head, 30); // List: 30 -> null

        head = insert(head, 20); // List: 20 -> 30 -> null

        head = insert(head, 10); // List: 10 -> 20 -> 30 -> null

        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
