public class This_1 {
	private String name;
	private static int count=0;
	public static void main ( String args[] ) {
		This_1 t1 = new This_1();
		t1.setName("Rida Shabbir");
		System.out.println("Instance t1 name variable value: " + t1.getName() );
		This_1 t2 = new This_1();
		t2.setName("Minal Rameen");
		System.out.println("Instance t1 name variable value: " + t2.getName() );
	}
	public This_1 () {
		count++;
		System.out.println("Instance " + count + " created." );
	}
	public void setName(String name) {
		this.name = name;
    }
    public String getName() {
		return this.name;
    }
}

//Referring to the current object:
//In this example on line # 17 this.name = name; this is pointing towards the name variable of the current instance/object
//So you can see we created two objects here when we called setName for instance 1 the value is passed to it's name varibale
//So is the case for instance two, this.name will allocate the passed value to the varible of the object instance that is called
//That is why you see different names are printed on screen when you call both objects getName method