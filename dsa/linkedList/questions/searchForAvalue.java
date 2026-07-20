package dsa.linkedList.questions;

public class searchForAvalue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        int value = 30;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;

        int index = 0;

        while (temp != null) {

            if (temp.data == value) {
                System.out.println("value is at index " + index);
            }

            temp = temp.next;
            index++;
        }

    }

}
