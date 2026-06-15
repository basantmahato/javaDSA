package recursion;

public class Print1toN {

    public static void ntimes(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.println(i);

        ntimes(i + 1, n);

    }

    public static void main(String[] args) {

        ntimes(1, 5);

    }

}
