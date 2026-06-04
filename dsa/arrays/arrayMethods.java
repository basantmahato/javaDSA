package dsa.arrays;

import java.util.Arrays;

public class arrayMethods {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = { 1, 2, 3, 6, 5 };

        System.out.println(Arrays.toString(arr));

        // equal two arrays
        System.out.println(Arrays.equals(arr, arr2));

        // check difference between two arrays
        System.out.println(Arrays.compare(arr, arr3));

        // check difference between two arrays
        System.out.println(Arrays.mismatch(arr, arr3));

    }

}