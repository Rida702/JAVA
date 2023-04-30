package inheritance;

public class mainclass {
	public static void main ( String[] args ){
		Animal a = new Animal();
		Bird b = new Bird();
		Dog d = new Dog();

		a.eat();
		a.sleep();

		b.eat();
		b.sleep();

		d.eat();
		d.sleep();
	}
}