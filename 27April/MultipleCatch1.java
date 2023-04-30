class MultipleCatch1 {
	public static void main ( String args[] ) {
		//System.out.println("Function All");
	try {
		//args[0] = "HI";
		//int a = 5/0;
	}catch(Exception e){
		System.out.println(e);
	}finally{
		int b = 9+8;
		System.out.println("I am Finally");
		System.out.println(b);
	}
	}
}

//Finally cannot be written without try
//Finally is written once only and it is optional you may not write finally clause
//Try is Written Once Only, but there can be many catch caluses, atleast one catch clause is necessary
//Finally Clause will be executed even if there is no exception
//