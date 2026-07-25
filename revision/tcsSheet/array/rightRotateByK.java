package revision.tcsSheet.array;

public class rightRotateByK {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        k = k % arr.length;

        // Rotate one step to the right, k times
        for (int i = 0; i < k; i++) {

            // Step 1: Save the last element before it gets overwritten
            int last = arr[arr.length - 1];

            // Step 2: Shift all elements one position to the right, starting from the end
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            // Step 3: Place the saved last element at the front of the array
            arr[0] = last;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}