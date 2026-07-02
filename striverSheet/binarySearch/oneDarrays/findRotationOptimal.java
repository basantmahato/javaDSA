class FindRotationOptimal {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        int low = 0;
        int high = arr.length - 1;

        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // left half sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else { // right half sorted
                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        System.out.println(index);
    }
}
