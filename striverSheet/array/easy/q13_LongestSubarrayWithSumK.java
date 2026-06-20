package striverSheet.array.easy;

public class q13_LongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        long k = 15;
        
        // j is the left pointer of our sliding window
        int j = 0;
        // sum keeps track of the total sum of elements in the current window
        long sum = 0;
        // maxLen stores the maximum length of a valid subarray found so far
        int maxLen = 0;

        // i is the right pointer that expands the window to the right
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the window's sum
            sum = sum + arr[i];

            // If the sum exceeds the target k, shrink the window from the left
            while (j <= i && sum > k) {
                // Subtract the element at the left pointer from the sum
                sum = sum - arr[j];
                // Move the left pointer forward
                j++;
            }

            // If the current window's sum exactly matches the target k
            if (sum == k) {
                // Update maxLen if the current window (size: i - j + 1) is larger
                maxLen = Math.max(maxLen, i - j + 1);
            }
        }

        System.out.println("Longest Subarray Length: " + maxLen); // Expected: 4
    }
}
