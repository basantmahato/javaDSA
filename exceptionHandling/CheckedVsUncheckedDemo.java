package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUncheckedDemo {
    
    // Unchecked Exception (extends RuntimeException)
    // The compiler does NOT force you to handle or declare it.
    public static void uncheckedExceptionExample() {
        System.out.println("--- Unchecked Exception Demo ---");
        int[] numbers = {1, 2, 3};
        // This will throw an ArrayIndexOutOfBoundsException at runtime.
        System.out.println(numbers[5]); 
    }

    // Checked Exception (extends Exception, but not RuntimeException)
    // The compiler FORCES you to either catch it (try-catch) OR declare it using 'throws' in the signature.
    public static void checkedExceptionExample() throws IOException {
        System.out.println("\n--- Checked Exception Demo ---");
        File file = new File("non_existent_file.txt");
        // FileReader constructor throws FileNotFoundException, which is a Checked Exception.
        // We use 'throws IOException' (a parent of FileNotFoundException) to pass the responsibility to the caller.
        FileReader fr = new FileReader(file); 
        fr.close();
    }

    public static void main(String[] args) {
        // Handling the unchecked exception
        try {
            uncheckedExceptionExample();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Unchecked Exception: " + e.getClass().getSimpleName());
        }

        // Handling the checked exception declared with 'throws'
        try {
            checkedExceptionExample();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getClass().getSimpleName());
        }
    }
}
