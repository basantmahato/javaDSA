package revision.tcsSheet.array;

public class rotateArrByKelements {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 55, 66, 22 };

        int start = 0;
        int end = 2;

        for (int i = start; i < end; i++) {

            while (start < end) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
