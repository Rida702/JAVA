public class This_2 {
	private String name;
	public This_2 ( String name ) {
		this.name = name;
	}
	public This_2 () {
		this("Rida");
	}
	public String getName () {
		return this.name;
	}
	public static void main ( String []args ) {
		This_2 t1 = new This_2();
		System.out.println(t1.getName());
		This_2 t2 = new This_2("Minal");
		System.out.println(t2.getName());
	}
}
//Calling another constructor
//The "this" keyword is used to call another constructor within the same class. This is known as a constructor chaining
//In this example, the "this" keyword is used to call the constructor with a String parameter from the constructor with no parameters.