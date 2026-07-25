package revision.tcsSheet.array;

import java.util.Arrays;
import java.util.HashMap;

public class replaceElByRank {

    public static void main(String[] args) {

        int arr[] = { 23, 2, 1, 45, 6 };

        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = 0; i < temp.length; i++) {

            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}