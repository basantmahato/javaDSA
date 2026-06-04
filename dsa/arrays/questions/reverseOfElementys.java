package dsa.arrays.questions;

import java.util.Scanner;

public class reverseOfElementys {

    public static void main(String[] args) {

        System.out.println("Enter the length of the array");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th element of the array");
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();

    }

}
