public class exp1 {
	public static void main ( String args[] ) {
	System.out.println(Divide.divide(10, 5));
	System.out.println("\n");
	System.out.println(Divide.divide(10, 0));

	/*Divide.divide(10, 5);
	System.out.println("\n");
	Divide.divide(10, 0);*/
	}
}

class Divide {
	static int divide(int numerator, int denominator) {
		try {
			int result = numerator / denominator;
			return result;
			} catch (ArithmeticException e) {
				System.out.println("Division by zero!");
				return -1;
			} finally {
				System.out.println("Inside finally block!");
			}
}
}
