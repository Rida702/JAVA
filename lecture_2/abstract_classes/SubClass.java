public class SubClass {
    public static void main(String[] args) {
        Animal animal = new Animal(5);
        System.out.println("Animal age: " + animal.age); // prints "Animal age: 5"
        animal.makeSound(); // prints "The animal makes a sound"

        Dog dog = new Dog("Fido", 3);
        System.out.println("Dog name: " + dog.name); // prints "Dog name: Fido"
        System.out.println("Dog age: " + dog.age); // prints "Dog age: 3"
        dog.makeSound(); // prints "The animal makes a sound"
        dog.bark(); // prints "The dog barks"
    }
}

class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    protected String name;

    public Dog(String name, int age) {
        super(age);
        this.name = name;
    }

    public void bark() {
        System.out.println("The dog barks");
    }
}
