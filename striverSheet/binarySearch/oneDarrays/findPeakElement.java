public class findPeakElement {

    // Brute Force Approach
    // Time Complexity: O(N), Space Complexity: O(1)
    public static int findPeakBruteForce(int[] arr) {
        int n = arr.length;
        
        // Edge cases
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;
        
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    // Optimal Approach: Binary Search
    // Time Complexity: O(log N), Space Complexity: O(1)
    public static int findPeakOptimal(int[] arr) {
        int n = arr.length;
        
        // Edge cases
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;
        
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // If mid is the peak
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            
            // If we are on an increasing slope, peak is on the right
            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } 
            // If we are on a decreasing slope or in a valley, peak is on the left
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        System.out.println("Array: [1, 2, 3, 1]");
        System.out.println("Brute Force Result: " + findPeakBruteForce(arr1));
        System.out.println("Optimal Result: " + findPeakOptimal(arr1));
        
        System.out.println();
        
        int[] arr2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Array: [1, 2, 1, 3, 5, 6, 4]");
        System.out.println("Brute Force Result: " + findPeakBruteForce(arr2));
        System.out.println("Optimal Result: " + findPeakOptimal(arr2));
    }
}
