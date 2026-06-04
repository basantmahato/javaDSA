package methods;

import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        var n = sc.nextInt();

        function(n);
        sc.close();

    }

    public static void function(int n) {

        if (n == 0) {
            return;
        } else {
            System.out.println("hii,,, recursion");
            function(n - 1);
        }

    }

}
