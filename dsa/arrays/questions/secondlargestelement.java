package dsa.arrays.questions;

public class secondlargestelement {

    public static void main(String[] args) {

        int largest = 0;
        int second_largest = 0;

        int[] arr = { 44, 55, 32, 44, 22, 43 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                second_largest = largest;
                largest = arr[i];

            }

        }

        System.out.println(second_largest);
        System.out.println(largest);
    }

}
