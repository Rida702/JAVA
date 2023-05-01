public class Test {
public static void main (String args[ ]){
//can only create references of abstract class
Shape s = null;
// Shape s1 = new Shape(); //cannot instantiate abstract class
//can point to the concrete subclass
s = new Circle();
s.calculateArea();
}
}

/* This is an example of abstract class. Note that
this class contains an abstract method with no
definition.
*/
abstract class Shape {
public abstract void calculateArea();
}

/* This class extends from abstract Shape class. Therefore to
become concrete class it must provides the definition of
calculateAreamethod.
*/
class Circle extends Shape {
private int x, y;
private int radius;
public Circle() {
x = 5;
y = 5;
radius = 10;
}

// providing definition of abstract method
public void calculateArea () {
double area = 3.14 * (radius * radius);
System.out.println("Area: " + area);
}
}//end of class
