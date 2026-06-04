package methods;

public record javaParameters() {

    public static void main(String[] args) {
        func(10, 20);
    }

    static void func(int a, int b) {
        System.out.println(" RESULT : " + (a + b));
    }

}
