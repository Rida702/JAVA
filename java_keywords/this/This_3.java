public class This_3 {
	private String name;
	private String city;
	public This_3 ( String name, String city ){
		this.name = name;
		this.city = city;
	}
	public void showDetails ( This_3 t ) {
		System.out.println( "Name: " + t.name );
		System.out.println( "City: " + t.city );
	}
	public static void main ( String []args ) {
	This_3 t1 = new This_3("Rida","Gujranwala");
	This_3 t2 = new This_3("Minal","Lahore");
	t1.showDetails(t1);
	System.out.println( "----------------------------------");
	t1.showDetails(t2);
	}
}

//Passing the current object as a parameter
//in line 15 t1.showDetails(t1); when we passed t1 as reference we got the values we passed in its constructor
//but when we passed t2 as reference we got values of t2 instance, that's how it works