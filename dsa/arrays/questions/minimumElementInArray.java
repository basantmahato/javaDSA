package dsa.arrays.questions;

import java.util.Scanner;

public class minimumElementInArray {

    public static void main(String[] args) {

        System.out.println(" Enter the number of array elemets");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th element of the array");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is " + min);

        sc.close();

    }

}
