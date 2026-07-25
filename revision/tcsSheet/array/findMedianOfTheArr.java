package revision.tcsSheet.array;

import java.util.Arrays;

public class findMedianOfTheArr {

    public static void main(String[] args) {

        int arr[] = { 2, 34, 4, 2, 5, 7 };

        Arrays.sort(arr);

        double median;
        int n = arr.length;

        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            median = arr[n / 2];
        }

        System.out.println(" Median :" + median);
    }

}
