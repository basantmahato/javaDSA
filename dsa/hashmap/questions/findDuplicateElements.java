package dsa.hashmap.questions;

import java.util.HashMap;

public class findDuplicateElements {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 21, 3, 2, 1, 4, 12, 323, 2 };

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int num : arr) {

            myHashMap.put(num, myHashMap.getOrDefault(num, 0) + 1);
        }

        for (int key : myHashMap.keySet()) {

            if (myHashMap.get(key) > 1) {

                System.out.println(key);
            }
        }

    }

}
