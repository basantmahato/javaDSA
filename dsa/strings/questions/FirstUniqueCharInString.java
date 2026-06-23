package dsa.strings.questions;

import java.util.HashMap;

public class FirstUniqueCharInString {

    public static void main(String[] args) {
        String s = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println("First unique character index: " + i);
                return;
            }
        }

        System.out.println(-1);
    }
}