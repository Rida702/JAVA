public class static_1 {
	private static int count=0;
	String name;
	public static_1 (String name) {
		count++;
		System.out.println("Object " + count + " craeted. Name: " + name);
	}
	public static void main ( String[] args ) {
		static_1 s1 = new static_1("Rida");
		static_1 s2 = new static_1("Minal");
		static_1 s3 = new static_1("Laiba");
		static_1 s4 = new static_1("Maria");
		static_1 s5 = new static_1("Asma");
		static_1 s6 = new static_1("Almas");
		static_1 s7 = new static_1("Hafsa");
	}
}
//The static keyword in Java is used to create class-level variables and methods that can be accessed without creating an instance of the class
//Class variables:
// You can use the static keyword to create class-level variables that are shared
//by all instances of the class. These variables are also known as static or class variables
//here you can see that count variable is kind of like a shared memory piece among all the objects, unlike name variable which is priavte to its instance which initialized it