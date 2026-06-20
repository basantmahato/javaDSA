package dsa.arrays.binarysearch.questions;

public class floorAndCeil {
    public static void main(String[] args) {

        int[] nums = { 10, 20, 60, 80, 90, 100, 120 };
        int target = 85;

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (ans != -1) {
            System.out.println("Found: " + nums[ans]);
        } else {

            // boundary checks
            if (start < nums.length) {
                System.out.println("Ceil = " + nums[start]);
            } else {
                System.out.println("Ceil does not exist");
            }

            if (end >= 0) {
                System.out.println("Floor = " + nums[end]);
            } else {
                System.out.println("Floor does not exist");
            }
        }
    }
}