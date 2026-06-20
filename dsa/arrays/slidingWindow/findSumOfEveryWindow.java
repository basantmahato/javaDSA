package dsa.arrays.slidingWindow;

public class findSumOfEveryWindow {

    public static void main(String[] args) {

        int[] arr = { 5, 7, 2, 4 };
        int sum = 0;
        int k = 3;

        for (int i = 0; i < k; i++) {

            sum = sum + arr[i];

        }
        System.out.println(sum);

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            System.out.println(sum);
        }
    }

}
