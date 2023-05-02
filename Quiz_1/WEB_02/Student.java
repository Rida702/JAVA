interface StudentData {
	public void setName(String n);
	public void setRollNumber(int r);
	public void setCGPA(double c);
	public String getName();
	public int getRollNumber();
	public double getCGPA();
	public void showData();
}

public class Student implements StudentData {
	String name;
	int RollNumber;
	double CGPA;
	public void setName( String name){
		this.name = name;
	}
	public void setRollNumber( int RollNumber){
		this.RollNumber = RollNumber;
	}
	public void setCGPA( double CGPA){
		this.CGPA = CGPA;
	}
	public String getName(){
		return name;
	}
	public int getRollNumber(){
		return RollNumber;
	}
	public double getCGPA(){
		return CGPA;
	}
	public void showData(){
		System.out.println("Student Data: ");
		System.out.println("Student Name: " + getName());
		System.out.println("Student Roll Number: " + getRollNumber());
		System.out.println("Student CGPA: " + getCGPA());
	}

	public static void main(String[] args) {
	 Student s = new Student();
	 s.setName("Rida");
	 s.setRollNumber(41);
	 s.setCGPA(3.3);
	 s.getName();
	 s.getRollNumber();
	 s.getCGPA();
	 s.showData();


}
}