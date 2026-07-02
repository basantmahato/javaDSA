package revision.more;

public class reverseAnArray {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 1, 4, 2, 5, 9, 10 };

        int j = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
