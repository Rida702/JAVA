abstract class Animal {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    public abstract void makeSound();

    // Static method
    public static void showInfo() {
        System.out.println("This is an abstract class for animals.");
    }
}

class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Implementation of the abstract method
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class AbstractStaticExample {
    public static void main(String[] args) {
        // Call static method from abstract class
        Animal.showInfo();

        // Create object of Dog class
        Dog dog = new Dog("Buddy", 3);

        // Call instance method from abstract class
        dog.displayInfo();

        // Call implementation of abstract method in Dog class
        dog.makeSound();
    }
}

/*
In this example, the abstract class Animal has a static method showInfo()
which can be called directly on the class itself, without creating any objects.
The Dog class extends the Animal class and provides an implementation for the
abstract method makeSound(). The static method showInfo() from the abstract class
can be called without creating any objects of the Animal or Dog class, as shown
in the main() method.
*/