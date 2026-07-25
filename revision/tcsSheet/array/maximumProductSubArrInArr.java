package revision.tcsSheet.array;

public class maximumProductSubArrInArr {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = i; j < arr.length; j++) {

                product = product * arr[j];

                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        System.out.println("Maximum Product = " + maxProduct);
    }
}