public class Override {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // prints "The animal makes a sound"

        Dog dog = new Dog();
        dog.makeSound(); // prints "The dog barks"
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}

class Dog extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
