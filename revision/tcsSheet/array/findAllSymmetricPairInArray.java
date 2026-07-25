package revision.tcsSheet.array;

public class findAllSymmetricPairInArray {

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2 },
                { 3, 4 },
                { 2, 1 },
                { 5, 6 },
                { 4, 3 }
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i][0] == arr[j][1] &&
                        arr[i][1] == arr[j][0]) {

                    System.out.println(
                            "(" + arr[i][0] + ", " + arr[i][1] + ")" +
                                    " <--> " +
                                    "(" + arr[j][0] + ", " + arr[j][1] + ")");
                }
            }
        }
    }
}