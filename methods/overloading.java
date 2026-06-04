package methods;

public class overloading {
    public static void main(String[] args) {

        var a = function1(10, 20, 30);
        var b = function1(10, 20);

        System.out.println(a);
        System.out.println(b);

    }

    static int function1(int a, int b) {
        return a + b;
    }

    static int function1(int a, int b, int c) {
        return a + b + c;
    }

}
