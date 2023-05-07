import java.io.*;

public class public_1 {
	private int Rollno;
	private int marks;

	public void setRollno ( int Rollno ) {
		this.Rollno = Rollno;
	}
	public int getRollno (){
		return this.Rollno;
	}

	public void setmarks ( int marks ) {
			this.marks = marks;
		}
		public int getmarks (){
			return this.marks;
	}

	public static void main ( String[] args ){
	public_1 p = new public_1();
	//p.Rollno;//this will give an error as you cannot access these data members directly
	//p.marks;
	p.setRollno(41);
	System.out.println("Roll No: " + p.getRollno());
	p.setmarks(25);
	System.out.println("Marks: " + p.getmarks());
	}
}

//the private keyword is used to control the access to class members (i.e. fields, methods, constructors) from outside the class.
//Encapsulation:
//One of the primary uses of the private keyword is to enforce encapsulation.
//By declaring a field or method as private, you are preventing it from being accessed directly from outside the class.
//Instead, you can provide public methods (also called getters and setters) that control how the field is accessed and modified.
//This helps to protect the integrity of the class's data and behavior.
//Information hiding: The private keyword allows you to hide the implementation details of a class from outside users.
//Security: The private keyword can also be used to prevent unauthorized access to sensitive information or methods