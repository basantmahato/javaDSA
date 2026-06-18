package striverSheet.array.easy;

public class q1_largestElement {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 7, 4, 6, 4 };

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);

    }

}
