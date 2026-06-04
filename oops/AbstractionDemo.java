package oops;

// Abstract class (can have abstract and concrete methods)
abstract class Vehicle {
    abstract void start(); // Abstract method (no body)

    public void stop() { // Concrete method (has body)
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with a key or push button.");
    }
}

// Interface (100% abstraction by default in older Java, can have default methods now)
interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar by strumming strings.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");
        // Vehicle v = new Vehicle(); // Error: Cannot instantiate abstract class
        Vehicle myCar = new Car(); // Can use reference of abstract class
        myCar.start();
        myCar.stop();

        System.out.println("\n--- Interface Demo ---");
        Playable myGuitar = new Guitar();
        myGuitar.play();
    }
}
