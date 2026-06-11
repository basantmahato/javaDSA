package dsa.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Selection Sort algorithm.
     * It divides the input list into two parts: a sorted sublist of items which is built up from left to right, 
     * and a sublist of the remaining unsorted items that occupy the rest of the list.
     * It repeatedly selects the smallest element from the unsorted sublist and swaps it with the leftmost unsorted element.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int min_idx = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; // Update index of minimum element
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));
    }
}
