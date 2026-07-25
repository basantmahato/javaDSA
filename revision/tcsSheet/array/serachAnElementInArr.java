package revision.tcsSheet.array;

public class serachAnElementInArr {

    public static void main(String[] args) {

        int arr[] = { 23, 23, 23, 121, 432, 232, 12 };

        int val = 232;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val) {
                System.out.println(arr[i]);
            }

        }

    }

}
