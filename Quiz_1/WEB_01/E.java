import java.util.Scanner;
import java.io.*;

public class E {
	public static void main (String[] str){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = scanner.nextInt();
	if(num<0) System.out.println("It is a Neagtive Number.");
	else System.out.println("It is a Positive Number.");
	}
}



