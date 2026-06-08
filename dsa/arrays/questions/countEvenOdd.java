package dsa.arrays.questions;

import java.util.Scanner;

public class countEvenOdd {

    public static void main(String[] args) {
        System.out.println("enter array size");

        Scanner sc = new Scanner(System.in);

        int arraysize = sc.nextInt();

        System.out.println("enter array elements");

        int[] arr = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {

            arr[i] = sc.nextInt();

        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arraysize; i++) {

            if (arr[i] % 2 == 0) {

                even = even + 1;

            } else {
                odd = odd + 1;

            }

        }

        System.out.println("even" + even);
        System.out.println("odd" + odd);

        sc.close();
    }

}
