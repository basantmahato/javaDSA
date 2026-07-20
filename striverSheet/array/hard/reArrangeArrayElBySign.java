
public class reArrangeArrayElBySign {
    public static void main(String[] args) {

        int[] arr = { 3, -2, 1, -5, 2, -4 };

        int[] ans = new int[arr.length];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int el : arr) {

            if (el > 0) {
                ans[positiveIndex] = el;

                positiveIndex = positiveIndex + 2;
            } else {

                ans[negativeIndex] = el;

                negativeIndex = negativeIndex + 2;
            }
        }

        for (int el : ans) {

            System.out.println(el);

        }

    }

}
