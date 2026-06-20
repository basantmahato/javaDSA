package dsa.arrays.twopointers;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                // If we found a valid triplet that sums to 0
                if (sum == 0) {
                    System.out.println("the triplets are " + arr[i] + " " + arr[left] + " " + arr[right]);

                    // Skip duplicate elements for the left pointer to avoid duplicate triplets
                    while (left < right && arr[left] == arr[left + 1])
                        left++;

                    // Skip duplicate elements for the right pointer to avoid duplicate triplets
                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;
                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

    }
}
