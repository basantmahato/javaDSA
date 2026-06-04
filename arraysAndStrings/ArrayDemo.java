package arraysAndStrings;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("--- 1D Array Demo ---");
        // Declaration and allocation
        int[] numbers = new int[5]; // Array of size 5, initialized with default values (0)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Inline declaration and initialization
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Printing arrays
        System.out.println("Numbers array: " + Arrays.toString(numbers));
        
        System.out.print("Fruits array using enhanced for-loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("\n--- 2D Array Demo ---");
        // 2D Array (Matrix) inline initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix elements (3x3):");
        for (int i = 0; i < matrix.length; i++) {       // Loops over rows
            for (int j = 0; j < matrix[i].length; j++) {  // Loops over columns in current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
        
        System.out.println("\n--- Jagged Array Demo (2D Array with different column lengths) ---");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5, 6};
        jaggedArray[2] = new int[]{7, 8, 9};
        
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + i + ": " + Arrays.toString(jaggedArray[i]));
        }
    }
}
