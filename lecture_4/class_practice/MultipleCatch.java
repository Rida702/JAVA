class MultipleCatch {
	public static void main ( String args[] ) {
		//System.out.println("Function All");
	try {
		args[0] = "HI";
		int a = 5/0;
	}catch(Exception e){
		System.out.println(e);
	}finally{
		System.out.println("I am Finally");
	}
	}
}