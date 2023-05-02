import java.io.*;
public class FBlockDemo {
public static void main(String args[ ]) {
try {
FileReader fr = new FileReader ("myfile.txt");
BufferedReader br = new BufferedReader(fr);
String s = br.readLine();
System.out.println(s);
}catch (IOException ioEx) {
System.out.println(ioEx );
} finally {
System.out.println("finally block always execute");
//write any clean up code if required
}
}//end of main
}//end of class