package dsa.strings.questions;

public class validAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println("Are '" + s + "' and '" + t + "' anagrams? " + result);
    }

    // Beginner-friendly method to check for valid anagrams
    public static boolean isAnagram(String s, String t) {
        // Step 1: If the strings have different lengths, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a frequency array for the 26 lowercase English letters
        int[] charCounts = new int[26];

        // Step 3: Count the characters
        // We add 1 for every character in string 's'
        // We subtract 1 for every character in string 't'
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++; // Increment for 's'
            charCounts[t.charAt(i) - 'a']--; // Decrement for 't'
        }

        // Step 4: Check the results
        // If they are perfect anagrams, every single letter's count should be exactly 0
        for (int count : charCounts) {
            if (count != 0) {
                return false; // Found a mismatch!
            }
        }

        return true; // All counts are 0, they are anagrams!
    }
}
