import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class F {
	public static void main (String[] str){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = scanner.nextInt();
	int[] a = new int[4];
	int i=0, n=num;
	while (num!=0) {
			a[i] = num%10;
			num = num/10;
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