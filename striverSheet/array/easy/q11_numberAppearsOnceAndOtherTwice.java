package striverSheet.array.easy;

public class q11_numberAppearsOnceAndOtherTwice {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 2, 3 };

        int value = 0;

        for (int i = 0; i < arr.length; i++) {

            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }

            if (counter == 1) {
                value = arr[i];
                break;
            }
        }

        System.out.println(value);
    }
}
