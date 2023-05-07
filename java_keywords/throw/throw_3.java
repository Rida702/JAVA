import java.io.*;
public class throw_3 {
	public static void main ( String[] args ){
		try{
		doSomething(); }
		catch (IOException e) {
		   System.out.println("Main method caught exception: " + e.getMessage()); }
	}
	public static void doSomething() throws IOException {
		try{
		  BufferedReader reader = new BufferedReader(new FileReader("file.txt"));	}
	    catch (IOException e) {
	      System.out.println("Caught exception: " + e.getMessage());
	      throw e;	}
    }
}
//Rethrowing exceptions:
//The throw keyword can also be used to rethrow an exception that was caught in a try-catch block.
//This is useful for propagating the exception up the call stack so that it can be
//handled by a higher-level method or caught by the main method