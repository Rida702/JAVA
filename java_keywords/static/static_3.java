public class static_3 {
	public static class NestedClass {
	        public void printMessage() {
	            System.out.println("Hello from NestedClass");
	        }
    }
	public static void main ( String[] args ) {
		static_3.NestedClass nested = new static_3.NestedClass();
        nested.printMessage();
	}
}

//You can use the static keyword to define nested classes that are associated with the outer class,
//but do not have access to the instance variables and methods of the outer class. These are known as static nested classes.