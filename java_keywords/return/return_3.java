public class return_3 {
	private int age;
	public static boolean validateAge ( int age ) {
		if(age<18) return true;
		else return false;
	}
	public static void main ( String[] args ) {
	if(return_3.validateAge(9)) System.out.println("Age is Not Valid.");
	else System.out.println("Age is Valid.\n");
	if(return_3.validateAge(19)) System.out.println("Age is Not Valid.");
	else System.out.println("Age is Valid.\n");
	}
}
//Returning a boolean value to indicate success or failure
//Methods can return a boolean value to indicate whether an operation was successful or not