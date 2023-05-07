class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Bark!");
    }

    void printDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
    }

}

public class Abstract1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "Labrador");
        myDog.makeSound();
        myDog.printDetails();
    }
}

//Abstract classes:
//An abstract class is a class that cannot be instantiated, but can be subclassed.
//It can contain both abstract and non-abstract methods.
//Abstract classes are typically used to define a common interface for a group of related classes.

//Abstract methods:
//An abstract method is a method that is declared but does not have an implementation.
//The implementation is provided by the subclass that extends the abstract class.
//Abstract methods are typically used to define a common method signature for a group of related classes.

//Polymorphism:
//Abstract classes and methods are often used in polymorphism.
//Polymorphism allows a subclass to inherit from a superclass and to use its methods,
//but also to override those methods to provide a custom implementation.

//Encapsulation:
//Abstract classes can be used to encapsulate implementation details,
//while providing a well-defined interface to the outside world.
//This allows the implementation to be changed without affecting the users of the class.
