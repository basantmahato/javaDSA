package dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class syntax {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Add elements
        queue.add(10); // Throws exception if full
        queue.offer(20); // Returns false if full
        
        // Peek at the head
        System.out.println("Head element: " + queue.peek());
        
        // Remove element from head
        System.out.println("Removed element: " + queue.poll());
        
        // Check if empty
        System.out.println("Is queue empty: " + queue.isEmpty());
    }
}
