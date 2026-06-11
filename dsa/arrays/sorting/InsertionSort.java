package dsa.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Insertion Sort algorithm.
     * It builds the final sorted array one item at a time. It is much less efficient on large lists 
     * than more advanced algorithms such as quicksort, heapsort, or merge sort.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // Loop from the second element (index 1) to the end
        for (int i = 1; i < n; ++i) {
            // 'key' is the element we want to insert into the correct position in the sorted part
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than the key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Insert the key in its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));
    }
}
