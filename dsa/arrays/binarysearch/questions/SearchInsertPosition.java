package dsa.arrays.binarysearch.questions;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target, return its index
            } else if (nums[mid] < target) {
                start = mid + 1; // Target must be to the right
            } else {
                end = mid - 1; // Target must be to the left
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        System.out.println("Target 5 should be at index: " + searchInsert(nums, 5)); // Output: 2
        System.out.println("Target 2 should be at index: " + searchInsert(nums, 2)); // Output: 1
        System.out.println("Target 7 should be at index: " + searchInsert(nums, 7)); // Output: 4
        System.out.println("Target 0 should be at index: " + searchInsert(nums, 0)); // Output: 0
    }
}
