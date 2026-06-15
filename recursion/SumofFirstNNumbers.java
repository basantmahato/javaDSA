package recursion;

public class SumofFirstNNumbers {
    public static void main(String[] args) {

        System.out.println(sumof(7));

    }

    public static int sumof(int n) {

        if (n == 0) {

            return 0;

        }

        return n + sumof(n - 1);

    }

}
