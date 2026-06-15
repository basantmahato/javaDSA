package recursion;

public class PrintNto1 {

    public static void main(String[] args) {

        ntimes(1, 5);

    }

    public static void ntimes(int i, int n) {
        if (n <= i) {
            return;
        }

        System.out.println(n);

        // --n;

        ntimes(i, --n);
    }
}
