package revision.tcsSheet.array;

public class findNonRepeatingElinArr {

    public static void main(String[] args) {

        int arr[] = { 23, 3, 2, 32, 23, 3, 2, 1, 34, 12 };

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}