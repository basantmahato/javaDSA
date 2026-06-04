package oops;

class MathOperations {
    // Compile-time polymorphism (Method Overloading)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    // Run-time polymorphism (Method Overriding)
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("--- Compile-time Polymorphism (Overloading) ---");
        MathOperations math = new MathOperations();
        System.out.println("Add 2 ints: " + math.add(5, 10));
        System.out.println("Add 3 ints: " + math.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + math.add(5.5, 10.5));

        System.out.println("\n--- Run-time Polymorphism (Overriding) ---");
        Shape myShape = new Shape();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        myShape.draw();      // Calls Shape's draw
        myCircle.draw();     // Calls Circle's draw
        myRectangle.draw();  // Calls Rectangle's draw
    }
}
