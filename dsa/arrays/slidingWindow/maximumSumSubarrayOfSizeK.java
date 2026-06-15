package dsa.arrays.slidingWindow;

public class maximumSumSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 7, 2, 1, 3, 3, 2 };
        int k = 3;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {

            windowSum += arr[i];

        }

        int maxSum = windowSum;

        // slide window

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);

    }

}
