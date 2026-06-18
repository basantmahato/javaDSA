package striverSheet.array.easy;

public class q13_LongestSubarrayWithSumK {

    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int left = 0, right = 0;
        long sum = 0;
        int maxLen = 0;
        int n = arr.length;

        while (right < n) {
            sum += arr[right];

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        long k = 15;
        System.out.println("Longest Subarray Length: " + longestSubarrayWithSumK(arr, k)); // Expected: 4
    }
}
