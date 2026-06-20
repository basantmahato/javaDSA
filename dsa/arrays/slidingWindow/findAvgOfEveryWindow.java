package dsa.arrays.slidingWindow;

public class findAvgOfEveryWindow {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 4 };
        int avg = 0;
        int sum = 0;
        int k = 3;

        for (int i = 0; i < k; i++) {

            sum = sum + arr[i];

            avg = sum / 3;

        }

        System.out.println(avg);

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            avg = sum / 3;

            System.out.println(avg);
        }

    }

}
