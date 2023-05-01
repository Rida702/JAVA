class Poly{
public static void main (String args[]){

// Make employee references
	Employee ref1, ref2;
	ref1 = new Employee(89, "khurram ahmad");
// is-a relationship, polymorphism
	ref2 = new Teacher (91, "ali raza", "phd");

	ref1.display(); //call to Employee class display method
	ref2.display(); //call to Teacher class display method
	System.out.println("\n\nEmployee: " +ref1.toString());

	System.out.println("Teacher: " + ref2.toString());
} //end of main
}//end class

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
		  return id;
	}

	public String getName() {
	      return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + "]";
    }
}

class Teacher extends Employee {
    private String degree;

    public Teacher(int id, String name, String degree) {
        super(id, name);
        this.degree = degree;
    }



    @Override
    public void display() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Degree: " + degree);
    }

    @Override
    public String toString() {
        return "Teacher [ID=" + getId() + ", Name=" + getName() + ", Degree=" + degree + "]";
    }
}

