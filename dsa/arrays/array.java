package dsa.arrays;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int l = arr.length;

        int val = arr[2];

        arr[1] = 10;

        System.out.println(Arrays.toString(arr));
        System.out.println(l);
        System.out.println(val);

    }

}
