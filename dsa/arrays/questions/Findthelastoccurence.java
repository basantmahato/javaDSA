package dsa.arrays.questions;

public class Findthelastoccurence {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 634, 232, 2323, 3, 3, 34, 4, 5 };

        int lastoc = -1;
        int target = 4;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                lastoc = i;
            }
        }

        System.out.println(lastoc);
    }

}
