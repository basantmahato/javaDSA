package recursion;

public class PrintNTimes {

    public static void printN(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Hell");

        printN(n - 1);

    }

    public static void main(String[] args) {
        printN(5);
    }

}
