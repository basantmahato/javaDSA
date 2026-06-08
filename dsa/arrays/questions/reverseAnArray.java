package dsa.arrays.questions;

import java.util.Scanner;

public class reverseAnArray {

    public static void main(String[] args) {

        System.out.println("enter size of the arrray");

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        System.out.println("enter array elements");

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {

            arr[i] = sc.nextInt();

        }

        int[] reversedArray = new int[arraySize];

        int j = 0; // We need a separate index for the new array!
        for (int i = arraySize - 1; i >= 0; i--) {

            reversedArray[j] = arr[i];
            j++;

        }

        // To print the entire array, use java.util.Arrays.toString()
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversedArray));

        sc.close();

    }

}
