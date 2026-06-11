package dsa.arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class moveAllZerosToEnd {

    public static void main(String[] args) {

        System.out.println("Enter array size");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 0; i < size; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}