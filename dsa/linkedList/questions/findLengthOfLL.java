package dsa.linkedList.questions;

public class findLengthOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;

        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println(length);

    }

}
