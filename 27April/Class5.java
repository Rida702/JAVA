class Class5 {
	public static void main ( String args[] ) {
		fun1();
	}
	public static void fun1(){ System.out.println("Function 1"); fun2(); }
	public static void fun2(){
		System.out.println("Function 2");
		try {
			fun3();		}
		catch (Exception e ) {
			System.out.println("DO NOT WORRY");
		}
		}
	public static void fun3(){ System.out.println("Function 3"); int a = 5/0; }
}

//Throws keyword