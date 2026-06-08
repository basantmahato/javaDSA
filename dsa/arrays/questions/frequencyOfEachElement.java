package dsa.arrays.questions;

import java.util.Scanner;

public class frequencyOfEachElement {

    public static void main(String[] args) {

        System.out.println("enter array  sizee:");

        Scanner sc = new Scanner(System.in);

        int arraysize = sc.nextInt();

        int[] arr = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {

            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[arraysize];

        for (int i = 0; i < arraysize; i++) {

            if (visited[i] == true) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arraysize; j++) {

                if (arr[i] == arr[j]) {
                    count = count + 1;
                    visited[j] = true;
                }

            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        sc.close();
    }

}
