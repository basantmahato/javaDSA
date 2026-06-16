package dsa.priorityQueue;

import java.util.PriorityQueue;

public class syntax {
    public static void main(String[] args) {
        // Min Heap by default
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        // Peek at the smallest element
        System.out.println("Smallest element: " + pq.peek());
        
        // Remove the smallest element
        System.out.println("Removed element: " + pq.poll());
    }
}
