import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class B{
	public static void main (String[] arg){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = scanner.nextInt();
	int flag = 1;
	String str = Integer.toString(num);
	int j = str.length() - 1;
	for( int i=0; i<str.length()/2; i++ ) {
		if(str.charAt(i)==str.charAt(j)) {
			j--;
			continue;
		}
		else {
			flag = 0;
			break;
		}
	}
	if(flag==0) System.out.println("Number is not a Palindrom.");
	else		System.out.println("Number is a Palindrom.");
}
}