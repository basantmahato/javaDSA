package striverSheet.array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInAnArray {

    public static ArrayList<Integer> leaders(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] >= maxRight) {
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 5, 2 };

        System.out.println(leaders(arr));
    }

}
