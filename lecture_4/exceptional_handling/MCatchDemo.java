/* numbers.txt contains numbers. After reading number
from file, prints its square on console */
import java.io.*;

public class MCatchDemo {
	public static void main(String args[ ]) {
	try {
		//may throw FileNotFound & IOException
		FileReader fr = new FileReader ("numbers.txt");
		BufferedReader br = new BufferedReader(fr);
		//read the line
		String s = br.readLine();
		//may throw NumberFormatException, if s is not no.
		int number = Integer.parseInt(s);
		System.out.println(number * number);
		} catch (NumberFormatException nfEx ) {
			System.out.println(nfEx );
		} catch (FileNotFoundException fnfEx ) {
			System.out.println(fnfEx);
		} catch (IOException ioEx) {
			System.out.println(ioEx);
		}
	}
}