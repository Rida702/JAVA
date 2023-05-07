public class static_2 {
	public static void Print_1 () {
		System.out.println("This is BCSF20M541");
		System.out.println("A CS Student");
		System.out.println("Practicing web keywords");
		System.out.println("You can Access this method with class name without creating an object");
	}
	public void Print_2 () {
			System.out.println("\n-Sorry, You cannot Access this method with class name without creating an object");
	}
	public static void main ( String[] args ) {
		static_2.Print_1();
		//static_2.Print_2(); // this line will give an error as we didn't created an object to access a non static method
		static_2 s = new static_2();
		s.Print_2();
	}
}
//Class methods
//You can use the static keyword to create class-level methods that can be called without
//creating an instance of the class. These methods are also known as static or class methods
//Here main method is made static too so that when program is executed it can be accessed without creating an object