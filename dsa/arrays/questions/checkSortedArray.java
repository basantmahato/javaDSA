package dsa.arrays.questions;

import java.util.Scanner;

public class checkSortedArray {

    public static void main(String[] args) {

        System.out.println("enter array size");

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {

            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arraySize - 1; i++) {

            if (arr[i] < arr[i + 1]) {

                System.out.println("array is sorted!");

            } else {
                System.out.println("Array isn not sorted! ");
            }

        }

        sc.close();

    }

}
