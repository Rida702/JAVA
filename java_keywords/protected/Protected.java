class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak() {
        System.out.println(name + " says hello!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " barks!");
    }

    public void greet() {
        speak();
        bark();
    }
}

public class Protected {
	public static void main ( String[] args ) {
	Dog d = new Dog("Tommy");
	d.greet();
	}
}

//Inheritance:
//One of the primary uses of the protected keyword is to allow subclasses to access the fields and methods of their superclass.
//By declaring a field or method as protected, you are allowing it to be
//accessed by any subclass of the class that declares it, as well as by other members of the same package.
//Encapsulation:
//The protected keyword can also be used to enforce encapsulation by providing controlled access to class members.
//By declaring a field or method as protected, you are allowing it to be accessed only by the class that declares it and its subclasses.
//Information hiding:
//The protected keyword allows you to expose certain implementation details of a class to its subclasses,
//while still hiding them from outside users. This can make it easier to extend
//the functionality of a class without exposing its internal workings to the outside world.