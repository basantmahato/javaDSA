package dsa.stack;

import java.util.Stack;

public class syntax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push element to the top of the stack
        stack.push(10);
        stack.push(20);
        
        // Peek top element without removing
        System.out.println("Top element: " + stack.peek());
        
        // Pop element from the top
        System.out.println("Popped element: " + stack.pop());
        
        // Check if empty
        System.out.println("Is stack empty: " + stack.isEmpty());
    }
}
