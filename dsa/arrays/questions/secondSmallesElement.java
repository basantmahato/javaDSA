package dsa.arrays.questions;

public class secondSmallesElement {
    public static void main(String[] args) {

        int[] arr = { 44, 22, 11, 32, 121, 1221 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallesElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                secondSmallesElement = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallesElement && arr[i] != smallest) {

                secondSmallesElement = arr[i];
            }

        }

        System.out.println(secondSmallesElement);

    }

}