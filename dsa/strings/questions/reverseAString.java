package dsa.strings.questions;

public class reverseAString {

    public static void main(String[] args) {
        String s = "hello";

        char[] c = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        System.out.println(new String(c));
    }

}
