public class Myinterface {
	public static void main( String args[]){
		Animal a1 = null;
		a1 = new Dog("Fido");
		Dog d1 = new Dog("Pup");
		String name = a1.name;
		System.out.println(name);
		String dogname = a1.getName();
		System.out.println(dogname);
		a1.makeSound();
		d1.draw();
	}
}

// Abstract class
abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

// Interface
interface Drawable {
    public void draw();
}

// Implementation
class Dog extends Animal implements Drawable {
    public Dog(String name) {
        super(name);
    }

    //@Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    //@Override
    public void draw() {
        System.out.println("Drawing a dog");
    }
}
