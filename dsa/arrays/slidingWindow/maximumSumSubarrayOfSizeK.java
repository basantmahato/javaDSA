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
            int outgoingElement = arr[i - k]; // The element leaving the left side of the window
            int incomingElement = arr[i];     // The new element entering the right side of the window
            
            windowSum = windowSum - outgoingElement + incomingElement;

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);

    }

}
