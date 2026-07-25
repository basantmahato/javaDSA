package revision.tcsSheet.array;

public class findTheLargestNumber {

    public static void main(String[] args) {

        int[] arr = { 23, 232, 5345, 4324523 };

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                largest = arr[i];

            }

        }

        System.out.println("Second Smallest = " + largest);
    }
}