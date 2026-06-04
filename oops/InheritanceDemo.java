package oops;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("This " + species + " eats food.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        super("Dog"); // Call superclass constructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Golden Retriever");
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method specific to Dog
    }
}
