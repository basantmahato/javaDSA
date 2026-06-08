package dsa.arrays.questions;

import java.util.Scanner;

public class copy1arrrayto2 {

    public static void main(String[] args) {
        System.out.println("enter arraysize");

        Scanner sc = new Scanner(System.in);

        int arraysize = sc.nextInt();

        int[] arr = new int[arraysize];
        int[] copyarr = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {

            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arraysize; i++) {
            copyarr[i] = arr[i];
        }

        System.out.println(java.util.Arrays.toString(copyarr));

        sc.close();
    }

}
