package striverSheet.array.easy;

import java.util.ArrayList;

public class q9_unionOf2sortedArrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 4, 5, 6, 6 };

        // ArrayList is ideal here because the final size of the union is unknown.
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2

        // Optimal Two-Pointer Approach (O(N + M))
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                // Add arr1[i] if it's the first element or different from the last added element
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                // Add arr2[j] if it's the first element or different from the last added element
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // If arr1 still has elements left, add them
        while (i < arr1.length) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // If arr2 still has elements left, add them
        while (j < arr2.length) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        // Print the result
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
