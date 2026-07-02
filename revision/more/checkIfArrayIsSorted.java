package revision.more;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 23, 32, 65, 454, 234 };

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}