package revision.more;

public class findMinInArray {

    public static void main(String[] args) {

        int[] arr = { 12, 3, 4, 62, 5, 2, 4, 1, 23 };

        int min = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {

                min = arr[i];

            }
        }

        System.out.println(min);
    }
}
