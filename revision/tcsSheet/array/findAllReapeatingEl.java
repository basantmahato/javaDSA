package revision.tcsSheet.array;

public class findAllReapeatingEl {
    public static void main(String[] args) {

        int arr[] = { 3, 42, 23, 2, 1, 2, 1, 42 };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);

                }
            }
        }

    }

}
