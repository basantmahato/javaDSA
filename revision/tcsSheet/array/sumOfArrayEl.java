package revision.tcsSheet.array;

public class sumOfArrayEl {

    public static void main(String[] args) {

        int arr[] = { 23, 324, 23, 21, 234, 1, 23 };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        System.out.println(sum);
    }

}
