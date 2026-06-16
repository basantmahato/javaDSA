package dsa.linkedHashMap;

import java.util.LinkedHashMap;

public class syntax {
    public static void main(String[] args) {
        // LinkedHashMap maintains insertion order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("LinkedHashMap: " + map);
        
        // Get value
        System.out.println("Value for key 2: " + map.get(2));
        
        // Remove key
        map.remove(1);
    }
}
