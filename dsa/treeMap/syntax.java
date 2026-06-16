package dsa.treeMap;

import java.util.TreeMap;

public class syntax {
    public static void main(String[] args) {
        // TreeMap maintains keys in sorted order
        TreeMap<Integer, String> map = new TreeMap<>();
        
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("TreeMap: " + map);
        
        // Get value
        System.out.println("Value for key 1: " + map.get(1));
        
        // Remove key
        map.remove(2);
        
        // First and Last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
    }
}
