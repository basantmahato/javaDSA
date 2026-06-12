package dsa.hashmap.questions;

import java.util.HashMap;

public class findHighestFrequencyEl {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 3, 3, 3, 2, 3, 1, 32, 2 };

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int num : arr) {

            myHashMap.put(num, myHashMap.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int ans = -1;

        for (int key : myHashMap.keySet()) {

            if (myHashMap.get(key) > max) {
                max = myHashMap.get(key);
                ans = key;
            }
        }

        System.out.println(ans);

    }

}
