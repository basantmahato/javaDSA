package striverSheet.array.easy;

public class q3_checkIfArrayIsSortedRotated {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 1, 2 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int next = (i + 1) % arr.length;

            if (arr[i] > arr[next]) {
                count++;
            }
        }

        if (count <= 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
