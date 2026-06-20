package dsa.arrays.slidingWindow;

public class maximumAvgSubarray1 {

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 9, 2 };

        int sum = 0;
        int k = 3;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        double maxAvg = (double) maxSum / k;
        System.out.println("Maximum Average: " + maxAvg);
    }

}
