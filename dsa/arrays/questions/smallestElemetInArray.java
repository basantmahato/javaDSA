package dsa.arrays.questions;

import java.util.Scanner;

public class smallestElemetInArray {
    public static void main(String[] args) {

        System.out.println("Enter size of the array:");

        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        int[] arr = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {

            arr[i] = sc.nextInt();

        }

        int smallestNum = arr[0];

        for (int i = 1; i < arraysize; i++) {

            if (arr[i] < smallestNum) {

                smallestNum = arr[i];

            }

        }

        System.out.println("The smallest element is: " + smallestNum);

        sc.close();
    }
}
