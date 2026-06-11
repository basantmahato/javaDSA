package dsa.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble Sort algorithm.
     * It repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
     * The pass through the list is repeated until the list is sorted.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Loop for each pass over the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // The last 'i' elements are already sorted and in their correct position, 
            // so we only iterate up to n - i - 1
            for (int j = 0; j < n - i - 1; j++) {
                
                // Compare adjacent elements. If the left one is bigger, swap them.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap happened
                }
            }
            
            // Optimization: If no two elements were swapped by inner loop, 
            // it means the array is already sorted, so we can break early.
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Bubble Sort: " + Arrays.toString(arr));
    }
}
