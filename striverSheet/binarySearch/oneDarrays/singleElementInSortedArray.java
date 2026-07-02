public class singleElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int n = arr.length;

        // Edge cases:
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        if (arr[0] != arr[1]) {
            System.out.println(arr[0]);
            return;
        }
        if (arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1]);
            return;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If arr[mid] is the single element:
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                System.out.println(arr[mid]);
                return;
            }

            // We are in the left half:
            // (even, odd) indices have same elements
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1])
                    || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // Eliminate the left half
                low = mid + 1;
            } 
            // We are in the right half:
            else {
                // Eliminate the right half
                high = mid - 1;
            }
        }
    }
}
