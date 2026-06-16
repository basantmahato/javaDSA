package dsa.linkedHashSet;

import java.util.LinkedHashSet;

public class syntax {
    public static void main(String[] args) {
        // LinkedHashSet maintains insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate won't be added
        
        System.out.println("LinkedHashSet: " + set);
        
        // Check if contains
        System.out.println("Contains 20: " + set.contains(20));
        
        // Remove element
        set.remove(10);
    }
}
