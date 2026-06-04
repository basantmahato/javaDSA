package dsa.arrays;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th element of the array");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print("Element found at index " + i);
                break;
            }
        }

        sc.close();

    }

}
