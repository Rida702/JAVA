public class New_1 {
	public static void main ( String[] args ) {
		New_1 n = new New_1();
		n.name();
	}
	public New_1 () {
		System.out.println("Instance of class New_1 is created.");
	}
	public void name(){
		System.out.println("Rida Shabbir");
	}
}

//new keywords in Java is used for
//1.To create new instance/object of a class e.g., New_1 n1 = new New_1();
//Java will allocate memory on the heap for the object and return a reference to that object