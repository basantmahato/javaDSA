package dsa.arrays.questions;

import java.util.Scanner;

public class avgOfArray {

    public static void main(String[] args) {

        System.out.println("Enter avg of the array elements");

        Scanner sc = new Scanner(System.in);

        int arraysize = sc.nextInt();

        int[] arr = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {
            arr[i] = sc.nextInt();
        }
        ;

        //

        int sum = 0;
        int avg = 0;

        for (int i = 0; i < arraysize; i++) {

            int arrayVal = arr[i];

            sum = sum + arrayVal;

        }

        avg = sum / arraysize;

        System.out.println(avg);

        sc.close();

    }

}
