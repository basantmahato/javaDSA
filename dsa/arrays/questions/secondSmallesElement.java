package dsa.arrays.questions;

public class secondSmallesElement {

    public static void main(String[] args) {

        int[] arr = { 44, 22, 11, 32, 121, 1221 };

        int smallest = 0;
        int secondSmallesElement = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                secondSmallesElement = smallest;
                smallest = arr[i];

            } else {
                secondSmallesElement = arr[i];
            }

        }

        System.out.println(secondSmallesElement);

    }

}
