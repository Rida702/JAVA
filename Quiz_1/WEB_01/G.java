import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class G {
	public static void main (String[] str){
	//Scanner scanner = new Scanner(System.in);
	//System.out.println("Enter a Number: ");
	//int num = scanner.nextInt();
	for ( int num =0; num<=1000; num++) {
		int[] a = new int[4];
		int i=0, n=num, n1=num;
	while (n1!=0) {
			a[i] = n1%10;
			n1 = n1/10;
			i = i+1;
		}
	double sum =0;
	for( int j=0; j<i; j++ ) {
		int value = a[j];
		sum = sum + Math.pow(value, i);
	}
		if(sum==n) System.out.println("Number is Armstrong "+ n);
		else System.out.println("Number is Not Armstrong "+ n);
		}
	}
}