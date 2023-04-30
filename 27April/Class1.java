class Class1 {
	public static void main ( String args[] ) {
		//System.out.println("Function All");
	/*try {
		//args[0] = "HI";

		System.out.println("I am Try");
	}catch(Exception e){
		System.out.println(e);
	}*/
		int a = 5/0;
		int b = 9+8;
		System.out.println("I am Finally");
		System.out.println(b);
	}
}
//If we don't use finally clause program will fail at exception and it won't move further
//but if we use finally out exception will be handeled and the code after it will also be executed