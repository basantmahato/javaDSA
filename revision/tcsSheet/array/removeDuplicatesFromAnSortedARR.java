package revision.tcsSheet.array;

public class removeDuplicatesFromAnSortedARR {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 3, 4 };

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                // SWAP the elements instead of just overwriting!
                // This pushes the duplicate we are about to overwrite back into the array
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("Entire array with duplicates pushed to the end:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }

}
