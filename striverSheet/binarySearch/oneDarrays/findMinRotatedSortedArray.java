public class findMinRotatedSortedArray {

    public static int main(String[] args) {

        int[] arr = { 4, 5, 6, 0, 1, 2 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < arr[right]) {
                return arr[left];
            }

            int mid = left + (right - left / 2);

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];

    }
}