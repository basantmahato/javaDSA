package controlFlow;

public class IfElseDemo {
    public static void main(String[] args) {
        int score = 85;

        System.out.println("--- If-Else Statement Demo ---");
        System.out.println("Score: " + score);

        // If, Else-If, Else ladder
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        System.out.println("\n--- Nested If Demo ---");
        boolean isWeekend = true;
        boolean isRaining = false;
        
        if (isWeekend) {
            if (!isRaining) {
                System.out.println("It's a clear weekend. Let's go to the park!");
            } else {
                System.out.println("It's raining. Let's watch a movie indoors.");
            }
        } else {
            System.out.println("It's a weekday. Time to work or study.");
        }
    }
}
