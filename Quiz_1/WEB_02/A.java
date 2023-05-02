import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class A{
	public static void main (String[] str){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number of rows and columns: ");
	int rows = scanner.nextInt();
	int cols = scanner.nextInt();
	int[][] matrix = new int[rows][cols];
	int[][] transpose_matrix = new int[cols][rows];
	System.out.println("Enter the Values of Matrix: ");
	for ( int i=0; i<rows; i++ ){
		for( int j=0; j<cols; j++ ){
			matrix[i][j] = scanner.nextInt();
			}
		}

	System.out.println("Transpose of matrix: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose_matrix[i][j] = matrix[j][i];
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}