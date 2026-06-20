package dsa.arrays.slidingWindow;

public class minimumSizeSubarrySum {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 2, 4, 3 };

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int k = 7;

        int i = 0; // left pointer

        for (int j = 0; j < arr.length; j++) { // right pointer

            sum = sum + arr[j];

            while (sum >= k) {

                min = Math.min(min, j - i + 1);

                sum = sum - arr[i];

                i++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}