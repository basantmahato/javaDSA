package dsa.arrays.slidingWindow;

public class findFirstNegetiveOfEveryWindow {

    public static void main(String[] args) {

        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };

        int k = 3;

        int[] result = new int[arr.length - k + 1];

        // --- 1. Process the first window (indices 0 to k-1) ---
        int firstNegativeIndex = 0;

        // Find the first negative in the initial window
        while (firstNegativeIndex < k && arr[firstNegativeIndex] >= 0) {
            firstNegativeIndex++;
        }

        // Store the result for the first window
        if (firstNegativeIndex < k) {
            result[0] = arr[firstNegativeIndex];
        } else {
            result[0] = 0;
        }

        // --- 2. Process the remaining windows (slide the window) ---
        for (int i = k; i < arr.length; i++) {

            int windowStart = i - k + 1; // The start index of our current window

            // If the negative number we found before is no longer in our current window
            if (firstNegativeIndex < windowStart) {
                firstNegativeIndex = windowStart;
            }

            // Find the next negative number in the current window boundaries
            while (firstNegativeIndex <= i && arr[firstNegativeIndex] >= 0) {
                firstNegativeIndex++;
            }

            // Store the result for the current window
            if (firstNegativeIndex <= i) {
                result[windowStart] = arr[firstNegativeIndex];
            } else {
                result[windowStart] = 0;
            }
        }

        // Print the result array
        System.out.print("First negative integers: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

}
