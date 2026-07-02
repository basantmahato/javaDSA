public class findHowManyTimesArrayIsRotated {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                count = i + 1;
                break;
            }
        }

        System.out.println(count);

    }

}
