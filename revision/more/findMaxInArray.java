package revision.more;

public class findMaxInArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 6, 7, 82, 2, 4 };

        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                max = arr[i];

            }
        }

        System.out.println(max);

    }

}
