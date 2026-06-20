package dsa.arrays.binarysearch.questions;

public class upperBound {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5 };
        int target = 4;
        int ans = nums.length;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);

    }

}
