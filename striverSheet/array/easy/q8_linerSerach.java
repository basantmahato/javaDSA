package striverSheet.array.easy;

public class q8_linerSerach {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 5, 2, 5, 2, 5, 62, 5, 65 };
        int k = 62;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(i);
            }
        }
    }

}
