package dsa.arrays.binarysearch.questions;

public class searchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;

        int result = search(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Helper method to keep code clean and beginner-friendly
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found! Return the index immediately.
            }

            // THE CORE TRICK: When you divide a rotated array in half, 
            // at least ONE of the halves will ALWAYS be properly sorted.

            // Check if the LEFT half is sorted
            if (arr[low] <= arr[mid]) {
                // Since the left half is sorted, we can easily check if our target is inside it
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1; // Target is in the left half, so eliminate the right half
                } else {
                    low = mid + 1;  // Target is NOT in the left half, so eliminate the left half
                }
            } 
            // If the left half is NOT sorted, then the RIGHT half MUST be sorted
            else {
                // Since the right half is sorted, we can check if our target is inside it
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;  // Target is in the right half, so eliminate the left half
                } else {
                    high = mid - 1; // Target is NOT in the right half, so eliminate the right half
                }
            }
        }

        return -1; // We didn't find the target
    }
}
