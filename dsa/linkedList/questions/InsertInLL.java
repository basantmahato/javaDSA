public class InsertInLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

        // insert at start
        Node d = new Node(5);
        d.next = a;
        a = d;

        // insert at end
        Node e = new Node(40);
        Node current = a;
        while (current.next != null) {
            current = current.next;
        }
        current.next = e;

        Node temp = a;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
