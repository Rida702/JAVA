public class static_4 {
	public static final double PI;

	    static {
	        // Example of a static initialization block
	        PI = 3.14159;
	        System.out.println("This mmessage will be printed when static block is initialized");
	        System.out.println("You can give as many messages as you want");
    }
	public static void main ( String[] args ) {
		System.out.println("PI = " + static_4.PI);
	}
}
//Initialization blocks:
//You can use the static keyword to define static initialization blocks that are executed when the class is loaded.
//These blocks are used to initialize static variables or perform other initialization tasks that need to be done once when the class is loaded.