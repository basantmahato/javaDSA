package dsa.arrays.twopointers;

public class removeDuplicatesfromSortedArrray {
    public static void main(String[] args) {

        int[] arr = { 5, 10, 10, 15, 20, 25 };

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}