public class inter2 {
    public static void main(String args[]) {
	Student s1 = new Student("Rida","Gujranwala");
	s1.print();
    }
}

interface Printable {
public void print();
}

class Student implements Printable{
private String name;
private String address;
public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
public String toString () {
return "name:"+name + "address:"+address;
}
public void print() {
System.out.println("Name: " +name+ "\naddress: "+address);
}
}
