package dsa.arrays.questions;

import java.util.Scanner;

public class duplicatesInElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th element of the array");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("Duplicate element found at index " + i + " and " + j);
                }
            }
        }

        sc.close();

    }

}
