import java.io.*;

public class CException_1 {
	public static void main(String args[ ]) {
	try {
	FileReader fr = new FileReader ("myfile.txt");
	BufferedReader br = new BufferedReader(fr);
	//read the line
	String s = br.readLine();
	System.out.println(s);
	} catch (IOException ex ) {
	System.out.println(ex);
	}
	}
}