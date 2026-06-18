package striverSheet.array.easy;

public class q7_moveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 4, 0, 6, 7, 0, 8, 5, 6, 3, 0, 2 };

        int l = arr.length;

        // insertPos keeps track of where the next non-zero element should go
        int insertPos = 0;

        for (int i = 0; i < l; i++) {
            if (arr[i] != 0) {
                // Swap the non-zero element to the insertPos
                int temp = arr[insertPos];
                arr[insertPos] = arr[i];
                arr[i] = temp;

                // Move the insertPos forward
                insertPos++;
            }
        }

        for (int i = 0; i < l; i++) {

            System.out.println(arr[i]);

        }

    }

}
