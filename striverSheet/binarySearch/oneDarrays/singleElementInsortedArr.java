public class singleElementInsortedArr {

    public static int main(String[] args) {

        int[] arr = { 0, 11, 11, 22, 22, 33, 33, 44 };

        // xor operator approach

        // int xor = 0;

        // for (int el : arr) {

        // xor = xor ^ el;

        // }

        // if (xor != 0) {
        // System.out.println(xor);
        // }

        // optimal binary search

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (mid % 2 != 0) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;

            } else {
                high = mid;
            }

        }

        return arr[low];

    }

}
