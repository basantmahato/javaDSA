package revision.tcsSheet.array;

import java.util.HashSet;

public class checkIfArrrayIsSubsetOfAnotherArray {

    public static void main(String[] args) {

        int arr[] = { 11, 22, 32, 23, 43 };
        int arr2[] = { 32, 23 };

        HashSet<Integer> set = new HashSet<>();

        // Store all elements of arr1
        for (int num : arr) {
            set.add(num);
        }

        boolean isSubset = true;

        // Check every element of arr2
        for (int num : arr2) {
            if (!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("Subset");
        } else {
            System.out.println("Not a Subset");
        }
    }
}