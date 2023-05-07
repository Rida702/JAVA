public class return_2 {
	private int age;
	public static void validateAge ( int age ) {
		if(age<18) return;
		else System.out.println("Age is Valid.");
	}
	public static void main ( String[] args ) {
	return_2.validateAge(9);
	return_2.validateAge(19);
	}
}

//Exiting a method early
//If a method needs to exit early, for example, if it encounters an error or a certain condition is met,
//it can use the "return" keyword to exit the method immediately.