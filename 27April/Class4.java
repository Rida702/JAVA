class Class4 {
	public static void Divide ( int numerator, int denominator ) {
	try {
		int result = numerator/denominator;
		return result;	}
	catch(Exception e){
		System.out.println(e);
		return -1;		}
	finally{
		System.out.println("I am Finally");	}
	}
	int a = 49;
	int b = 7;
	System.out.println(Divide(a,b));
}
//makes anything constant - final keyword
//final word with a function removes overriding
//if we final word with a class, it cannot be extended, final class cannot be extended
//Abstract classes object cannot be created
//final with parameter, its value cannot be changed
//static is sharable memory