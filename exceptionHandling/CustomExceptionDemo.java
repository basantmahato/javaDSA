package exceptionHandling;

// 1. Create a Custom Checked Exception by extending Exception
// (To create an unchecked custom exception, extend RuntimeException instead)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass the custom message to the parent Exception class
    }
}

public class CustomExceptionDemo {
    
    // Method that uses 'throw' to explicitly trigger our custom exception
    // It also uses 'throws' in the signature because InvalidAgeException is a checked exception
    public static void checkVotingEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            // Use 'throw new' to instantiate and throw the exception object
            throw new InvalidAgeException("Age is " + age + " - Not eligible to vote. Must be at least 18.");
        } else {
            System.out.println("Age is " + age + " - Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Custom Exception & Throw Keyword Demo ---");
        
        try {
            // This check will pass successfully
            checkVotingEligibility(20); 
            System.out.println("First check passed.\n");
            
            // This check will trigger the custom exception
            checkVotingEligibility(16); 
            
            // This line won't be reached because the exception interrupts the normal flow
            System.out.println("This line won't be reached."); 
            
        } catch (InvalidAgeException e) {
            // Catching our custom exception and printing its message
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
