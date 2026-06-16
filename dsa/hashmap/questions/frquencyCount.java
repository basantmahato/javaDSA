package dsa.hashmap.questions;

import java.util.HashMap;

public class frquencyCount {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 2, 12, 12, 3, 2, 12, 12 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.merge(num, 1, Integer::sum);
        }

        System.out.println(map);

    }

}
