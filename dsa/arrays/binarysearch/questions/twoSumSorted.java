package dsa.arrays.binarysearch.questions;

import java.util.Scanner;

public class twoSumSorted {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            int start = i + 1;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == complement) {
                    System.out.println("Found at indices: " + i + " and " + mid);
                    System.out.println("Values: " + arr[i] + " + " + arr[mid] + " = " + target);
                    return;
                } else if (arr[mid] < complement) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            scanner.close();
        }

    }

}
