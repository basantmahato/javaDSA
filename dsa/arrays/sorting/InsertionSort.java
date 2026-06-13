package dsa.arrays.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = { 1, 55, 25, 15, 48 };

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                // Shift the larger element one spot to the right to make room
                arr[j + 1] = arr[j];
                // Move our pointer one step further left to check the next element
                j--;

            }

            arr[j + 1] = key;
        }

        System.out.print("Sorted: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
