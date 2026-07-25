package revision.tcsSheet.array;

public class avgOfAllEL {

    public static void main(String[] args) {
        int arr[] = { 3, 3, 45, 2, 6, 2 };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        System.out.println(" AVERAGE  : " + sum / arr.length);
    }

}
