package arraysAndStrings;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("--- String Demo (Immutable) ---");
        // Strings in Java are immutable. Once created, their value cannot be changed.
        String str1 = "Hello";
        String str2 = "Hello"; // Points to the same object in the String Constant Pool
        
        // Creating string using 'new' keyword (creates a new object in Heap memory)
        String str3 = new String("Hello"); 
        
        System.out.println("str1 == str2 (Same reference?): " + (str1 == str2)); // true
        System.out.println("str1 == str3 (Same reference?): " + (str1 == str3)); // false
        System.out.println("str1.equals(str3) (Same value?): " + str1.equals(str3)); // true
        
        // Modifying a string creates a completely new string object
        String strModified = str1.concat(" World");
        System.out.println("Original str1 after concat: " + str1); // Still "Hello"
        System.out.println("New modified string: " + strModified);
        
        System.out.println("\n--- StringBuilder Demo (Mutable, Not Thread-Safe) ---");
        // StringBuilder is mutable and faster, making it great for single-threaded string manipulation
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Original StringBuilder: " + sb);
        
        sb.append(" Programming"); // Modifies the same object
        System.out.println("After append: " + sb);
        
        sb.insert(4, " is Awesome");
        System.out.println("After insert: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // Reversing back for next examples
        
        sb.delete(4, 15);
        System.out.println("After delete: " + sb);

        System.out.println("\n--- StringBuffer Demo (Mutable, Thread-Safe) ---");
        // StringBuffer provides the same functionality as StringBuilder but is synchronized.
        // It is thread-safe (multiple threads can use it safely) but slightly slower.
        StringBuffer buffer = new StringBuffer("Concurrent");
        System.out.println("Original StringBuffer: " + buffer);
        
        buffer.append(" Processing");
        System.out.println("After append: " + buffer);
        
        buffer.replace(0, 10, "Parallel");
        System.out.println("After replace: " + buffer);
    }
}
