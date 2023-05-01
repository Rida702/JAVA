abstract class Animal {
    // Final method in abstract class
    public final void eat() {
        System.out.println("Animal is eating");
    }

    // Abstract method in abstract class
    public abstract void makeSound();
}

class Dog extends Animal {
    // Implementing the abstract method in the concrete class
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    // Attempt to override the final method - this will result in a compilation error
    // as final methods cannot be overridden
    // Uncommenting the following code will yield a compilation error
    // public void eat() {
    //     System.out.println("Dog is eating");
    // }
}

public class AbstractFinalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Final method from abstract class
        dog.makeSound(); // Abstract method implemented in Dog class
    }
}

/*
In this example, we have an abstract class Animal with a final method eat()
and an abstract method makeSound(). The Dog class extends the Animal class
and provides an implementation for the makeSound() method. However, if we
attempt to override the final method eat() in the Dog class, it will result
in a compilation error. This demonstrates that a final method can be included
in an abstract class, but an abstract method cannot be declared as final.
*/