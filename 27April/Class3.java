import java.util.Scanner;
class Class3 {
	public static void main ( String args[] ){
	Scanner scanner = new Scanner(System.in);
	try {
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		System.out.println("The Square of the number is: " + (num*num) );}
	catch ( Exception e ) {
		System.out.println("Error Occured: " + e.getMessage());	}
	finally {
			System.out.println("Closing Scanner...");
			scanner.close();	}
	}
}