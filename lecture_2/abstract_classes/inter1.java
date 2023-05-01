public class inter1 {
    public static void main(String args[]) {

    }
}

interface Printable {
public void print();
}

class Student implements Printable{
private String name;
private String address;
public String toString () {
return "name:"+name +" address:"+address;
}
// NOT providing implementation of print method
}