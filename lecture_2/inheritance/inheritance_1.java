package inheritance;

public class inheritance_1 {
	public static void main ( String args[] ) {
	Animal a = new Animal();
	a.eat();
	a.sleep();
	Bird b = new Bird();
	a.eat();
	a.sleep();
	Dog d = new Dog();
	a.eat();
	a.sleep();
	}
}

class Animal {
	public Animal () {
	System.out.println("An animal has been created");
	}
	public void eat(){
	System.out.println("Animal Eats");
	}
	public void sleep(){
	System.out.println("Animal Sleeps");
	}

}

class Dog extends Animal {
	public Dog () {
	System.out.println("An dog has been created");
	}
	public void eat(){
	System.out.println("Dog Eats");
	}
	public void sleep(){
	System.out.println("Dog Sleeps");
	}

}

class Bird extends Animal {
	public Bird () {
	System.out.println("A Bird has been created");
	}
	public void eat(){
	System.out.println("Bird Eats");
	}
	public void sleep(){
	System.out.println("Bird Sleeps");
	}

}

//Package inheitance shows that compiler is expecting this file to be in a inheritance folder/directory