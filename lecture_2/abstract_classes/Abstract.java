public class Abstract {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound(); // prints "The dog barks"

        Animal animal2 = new Cat();
        animal2.makeSound(); // prints "The cat meows"
    }
}


abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}