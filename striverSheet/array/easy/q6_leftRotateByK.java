package striverSheet.array.easy;

import java.util.Arrays;

public class q6_leftRotateByK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n; // In case k is larger than the array length
        if (k == 0) return;
        
        // Brute Force Approach using a temporary array
        int[] temp = new int[k];
        
        // 1. Store the first k elements in the temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        
        // 2. Shift the remaining n-k elements to the left by k places
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        
        // 3. Copy the k elements from the temporary array to the end of the original array
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Array after left rotation by " + k + " places: " + Arrays.toString(arr));
    }
}
