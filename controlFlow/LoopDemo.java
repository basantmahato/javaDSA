package controlFlow;

public class LoopDemo {
    public static void main(String[] args) {
        System.out.println("--- For Loop Demo ---");
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- While Loop Demo ---");
        // Print numbers from 5 down to 1
        int j = 5;
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        System.out.println("\n--- Do-While Loop Demo ---");
        // Do-while guarantees at least one execution even if the condition is false initially
        int k = 10;
        do {
            System.out.print("This runs once: " + k + " ");
            k++;
        } while (k < 10); 
        System.out.println();
        
        System.out.println("\n--- Break and Continue Demo ---");
        for (int n = 1; n <= 10; n++) {
            if (n == 4) {
                System.out.println("Skipping 4 (using continue)");
                continue; // Skips the rest of the loop body and goes to the next iteration
            }
            if (n == 7) {
                System.out.println("Breaking loop at 7 (using break)");
                break; // Exits the loop entirely
            }
            System.out.println("Number: " + n);
        }
    }
}
