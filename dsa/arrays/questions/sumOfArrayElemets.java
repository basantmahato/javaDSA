package dsa.arrays.questions;

import java.util.Scanner;

public class sumOfArrayElemets {

    public static void main(String[] args) {

        System.out.println("Enter the size of the array");

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];

        System.out.println("Enter Array Elements now :");

        for (int i = 0; i < arraySize; i++) {

            arr[i] = sc.nextInt();

        }

        int sum = 0;

        for (int i = 0; i < arraySize; i++

        ) {

            int arrayVal = arr[i];

            sum = sum + arrayVal;

        }
        System.out.println(sum);

        sc.close();

    }

}
