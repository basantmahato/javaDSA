package revision.more;

public class findTheSumOfElements {

    public static void main(String[] args) {

        int[] arr = { 13, 23, 543, 21, 3223, 213 };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        System.out.println(sum);
    }

}
