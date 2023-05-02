public class UcException_1 {
public static void main(String args[ ]) {
try {
System.out.println(args[0]);
}catch (IndexOutOfBoundsException ex) {
System.out.println("You forget to pass command line argument");
}
}
}
