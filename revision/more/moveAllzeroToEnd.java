package revision.more;

public class moveAllzeroToEnd {

    public static void main(String[] args) {

        int[] arr = { 1, 23, 34, 0, 32, 0, 3, 4 };

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }
}