package exceptionHandling;

public class BasicExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Try, Catch, Finally Demo ---");
        
        int a = 10;
        int b = 0;
        
        try {
            System.out.println("Inside try block: attempting division by zero...");
            // This will cause an ArithmeticException (divide by zero)
            int result = a / b; 
            System.out.println("Result: " + result); // This line won't execute because of the exception
        } catch (ArithmeticException e) {
            // This block executes ONLY if an ArithmeticException occurs in the try block
            System.out.println("Inside catch block: Exception caught!");
            System.out.println("Error message: " + e.getMessage());
        } finally {
            // This block ALWAYS executes, regardless of whether an exception occurred or not.
            // It is typically used for cleanup code like closing resources (files, scanners, DB connections).
            System.out.println("Inside finally block: This ALWAYS runs.");
        }
        
        System.out.println("Program continues normally after the try-catch-finally blocks.");
    }
}
