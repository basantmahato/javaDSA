package oops;

public class ClassObject {

    public static void main(String[] args) {

        ClassObject myobj = new ClassObject();
        System.out.println(myobj.a);
        System.out.println(fun());

    }

    int a = 55;

    public static int fun() {
        int a = 77;
        return a;
    }

}
