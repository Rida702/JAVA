import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class C{
	public static void main (String[] arg){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Input String: ");
	String str = scanner.nextLine();
	System.out.println("Result: ");
	for( int i=0; i<str.length(); i++ ) {
		if(str.charAt(i)==' ') System.out.print("\n");
		else System.out.print(str.charAt(i));
		}
		System.out.print("\n");
	}
}