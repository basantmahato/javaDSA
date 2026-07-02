package revision.more;

public class findEvenOdd {

    public static void main(String[] args) {

        int[] arr = { 121, 2323, 2432, 2121, 2121 };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                even = even + 1;

            } else {
                odd = odd + 1;
            }
        }

        System.out.println(even);
        System.out.println(odd);
    }

}
