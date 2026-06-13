package dsa.arrays.sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // find smallest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }
}
