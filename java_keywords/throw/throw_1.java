public class throw_1 {
	public static void divide ( int a , int b ) {
	if(b==0) throw new ArithmeticException("Cannot be Divided by zero");
	double result = a/b;
	System.out.println("Result: " + result );
	}
	public static void main ( String[] args ){
		throw_1.divide(10,2);
		throw_1.divide(10,0);
		//throw_1.divide(10,2);
	}
}
//The throw keyword is used to manually throw an exception
//Throwing built-in exceptions
//The throw keyword can be used to manually throw any built-in exception, such as IllegalArgumentException, NullPointerException, or ArithmeticException