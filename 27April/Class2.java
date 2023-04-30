class Class2 {
	public static void main ( String args[] ) {
		try {

		int a = 5/0;
		args[0] = "HI";
	}catch( ArithmeticException e ){
		System.out.println("Excrption1");
	}catch( ArrayIndexOutOfBoundsException e ){
		System.out.println("Excrption2");
	}
}
}