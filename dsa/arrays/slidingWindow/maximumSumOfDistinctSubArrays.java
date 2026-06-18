package dsa.arrays.slidingWindow;

public class maximumSumOfDistinctSubArrays {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 4, 2, 9, 9, 9 };

        int max = 0;
        int k = 3;

        // Try every possible starting position for a window of size k
        for (int i = 0; i <= arr.length - k; i++) {
            int currentSum = 0;
            boolean isDistinct = true;

            // Check the 'k' elements starting from 'i'
            for (int j = i; j < i + k; j++) {
                // Manually check if arr[j] has already appeared earlier in this current window
                for (int m = i; m < j; m++) {
                    if (arr[j] == arr[m]) {
                        isDistinct = false;
                        break;
                    }
                }
                
                // If we found a duplicate, no need to keep checking this window
                if (!isDistinct) {
                    break;
                }

                currentSum += arr[j];
            }

            // If all elements in this window were distinct, check if it's the max sum
            if (isDistinct) {
                max = Math.max(max, currentSum);
            }
        }

        System.out.println(max);
    }

}
