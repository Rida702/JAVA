class InvalidAgeException extends Exception {
	InvalidAgeException ( String str ) {
		super(str);
	}
}

public class throw_2 {
	public static void checkAge ( int age )  throws InvalidAgeException{
		if( age<0 || age>100 ) throw new InvalidAgeException ("Age is not valid");
		System.out.println("Age: " + age );
	}
	public static void main ( String[] args ){
		try {
			//throw_2.checkAge(41);
			throw_2.checkAge(-41);
			throw_2.checkAge(41);
			throw_2.checkAge(441); }
		catch (Exception e ) {
			System.out.println(e.getMessage());
		}
	}
}
//Creating custom exceptions:
//The throw keyword can also be used to manually throw custom exceptions that are defined by the programmer.
//This is useful for handling errors or exceptional conditions that are specific to a particular application