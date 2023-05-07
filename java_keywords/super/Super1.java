class Animal {
    String name;
    protected static int count = 0;

    Animal(String name) {
		count++;
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

    static void printAnimalCount() {
        System.out.println("Animal count: " + Animal.count);
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "Labrador");
        myDog.makeSound();
        myDog.printDetails();
        Dog.printAnimalCount();
    }
}

//Calling the superclass constructor:
//The super keyword can be used to call a constructor of the parent class. This is useful when the parent class has a constructor that takes arguments that need to be initialized.
//Accessing parent class members:
//The super keyword can also be used to access methods or instance variables of the parent class that have been overridden in the subclass.
//Invoking parent class methods:
//The super keyword can be used to invoke a method in the parent class.
//This is useful when the method in the parent class has been overridden in the subclass and you want to invoke the parent class version of the method.
//Accessing parent class static members:
//The super keyword can also be used to access static members of the parent class.