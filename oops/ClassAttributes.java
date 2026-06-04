package oops;

public class ClassAttributes {

    int x = 77;
    final int val = 100;

    public static void main(String[] args) {
        ClassAttributes obj = new ClassAttributes();
        ClassAttributes obj2 = new ClassAttributes();
        obj.x = 88;
        obj2.x = 78;
        System.out.println(obj.x);
        System.out.println(obj2.x);
    }

}
