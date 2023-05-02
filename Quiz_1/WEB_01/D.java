import java.util.Scanner;
import java.io.*;

public class D {
	public static void main (String[] str){
	Scanner scanner = new Scanner(System.in);
	int min=99, max=0, sum=0, count=0;
	int num=0;
	while(true){
		System.out.println("Enter a Number: ");
		num = scanner.nextInt();
		if(num == -999) break;
		else {
		if(num>max) max = num;
		if(num<min) min =  num;
		sum = sum + num;
		count++; }
	}
	System.out.println("Minimum Number: " + min );
	System.out.println("Maximum Number: " + max );
	System.out.println("Sum of Numbers: " + sum );
	System.out.println("Average of Numbers: " + (sum/count) );
	}
}



