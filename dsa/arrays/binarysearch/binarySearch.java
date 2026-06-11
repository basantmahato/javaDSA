package dsa.arrays.binarysearch;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };

        int key = 7;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {

                System.out.println("Element found at index: " + mid);
                return;
            }

            else if (arr[mid] < key) {

                start = mid + 1;
            }

            else {

                end = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
