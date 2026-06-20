package dsa.arrays.binarysearch.questions;

public class searchFirstAndLastOccurance {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;

        // Step 1: Find the first occurrence
        int first = findFirstOccurrence(arr, target);
        
        // Step 2: Find the last occurrence
        int last = findLastOccurrence(arr, target);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    // Helper method to find ONLY the first occurrence
    private static int findFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1; // Default answer if target is not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;    // We found the target! Save the index.
                high = mid - 1; // Keep searching the LEFT half to see if there's an earlier one.
            } 
            else if (arr[mid] > target) {
                high = mid - 1; // The target is smaller, search the LEFT half
            } 
            else {
                low = mid + 1;  // The target is larger, search the RIGHT half
            }
        }
        return first;
    }

    // Helper method to find ONLY the last occurrence
    private static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1; // Default answer if target is not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;     // We found the target! Save the index.
                low = mid + 1;  // Keep searching the RIGHT half to see if there's a later one.
            } 
            else if (arr[mid] > target) {
                high = mid - 1; // The target is smaller, search the LEFT half
            } 
            else {
                low = mid + 1;  // The target is larger, search the RIGHT half
            }
        }
        return last;
    }
}
