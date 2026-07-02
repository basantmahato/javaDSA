package revision.more;

public class find2ndLargest {

    public static void main(String[] args) {

        int first_largest = Integer.MIN_VALUE;

        int second_largest = Integer.MIN_VALUE;

        int[] arr = { 23, 32, 1, 2, 2342, 123 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first_largest) {
                second_largest = first_largest;
                first_largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != first_largest) {
                second_largest = arr[i];
            }

        }

        System.out.println(second_largest);

    }

}
