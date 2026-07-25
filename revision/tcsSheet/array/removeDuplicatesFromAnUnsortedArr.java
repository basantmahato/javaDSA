package revision.tcsSheet.array;

import java.util.HashSet;

public class removeDuplicatesFromAnUnsortedArr {

    public static void main(String[] args) {

        int arr[] = { 23, 3, 5, 2, 34, 34, 2, 3 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        for (int num : set) {
            System.out.println(num);
        }
    }

}
