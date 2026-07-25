package revision.tcsSheet.array;

public class addElementInArr {

    public static void main(String[] args) {

        int arr[] = { 2, 34, 2, 1, 2, 3 };

        int val = 6;

        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = val;

        for (int num : newArr) {
            System.out.println(num);
        }

    }

}
