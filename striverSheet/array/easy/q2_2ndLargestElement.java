package striverSheet.array.easy;

public class q2_2ndLargestElement {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 23, 67, 2, 32 };

        int largest = arr[0];
        int secondLargest = largest;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

}
