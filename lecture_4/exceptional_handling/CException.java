import java.io.*;
public class CException {
public static void main(String args[ ]) {
FileReader fr = new FileReader ("input.txt");
BufferedReader br = new BufferedReader(fr);
//read the line
String s = br.readLine();
System.out.println(s);
}
}