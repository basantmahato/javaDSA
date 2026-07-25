package revision.tcsSheet.array;

import java.util.HashMap;

public class sortElinArrayByFreq {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                int freq1 = map.get(arr[j]);
                int freq2 = map.get(arr[j + 1]);

                if (freq1 < freq2) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                else if (freq1 == freq2 && arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}