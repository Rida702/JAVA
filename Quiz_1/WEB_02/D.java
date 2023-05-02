class Shape{
	String color;
	boolean filled;
	//Constructor
	public Shape (){
	this.color = "Red";
	this.filled = true;
	}
	public Shape (String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public void setColor (String color){
		this.color = color;
	}
	public String getColor () {
		return color;
	}
	public void setFilled (boolean filled){
			this.filled = filled;
	}
	public boolean isFilled () {
			return filled;
	}
	public String toString() {
	        return "Shape: \nColor=" + color + "\nFilled =" + filled + "\n";
    }
}

class Circle extends Shape{
	double radius;
	public Circle (){
		this.radius = 1.0;
	}
	public Circle (double radius){
		this.radius = radius;
	}
	public Circle ( String color, boolean filled, double radius ){
		super(color,filled);
		this.radius = radius;
	}
	public void setRadius ( double radius ) {
		this.radius = radius;
	}
	public double getRadius () {
		return radius;
	}
	public double getArea () {
		return 3.14159*radius*radius;
	}
	public double getPerimeter () {
		return 2*3.14159*radius;
	}
	public String toString() {
		return "Circle: \n Radius= " + getRadius() + "\nArea =" + getArea() + "\nPerimeter =" + getPerimeter() +"\n";
    }
}
class Rectangle extends Shape{
	double width;
	double length;
	public Rectangle (){
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle (double width, double length){
		this.width = width;
		this.length = length;
	}
	public Rectangle ( String color, boolean filled, double width, double length ){
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	public void setWidth ( double width ) {
		this.width = width;
	}
	public double getWidth () {
		return width;
	}
	public void setLength ( double length ) {
		this.length = length;
	}
	public double getLength () {
		return length;
	}
	public double getArea () {
		return length*width;
	}
	public double getPerimeter () {
		return (2*length)+(2*width);
	}
	public String toString() {
		return "Rectangle: \nWidth= " + getWidth() + "\nLength =" + getLength() + "\nPerimeter =" + getPerimeter() + "\nArea =" + getArea() +"\n";
    }
}

public class D {
	public static void main ( String[] args ) {
		Shape s = new Shape("Blue",true);
		System.out.println("Shape Function: " + s.toString());
		Circle c = new Circle("Blue",true, 1.5);
		System.out.println("\nCircle Function: " + c.toString());
		Rectangle r = new Rectangle("Blue",true, 1.5,1.5);
		System.out.println("\nRectangle Function: " + r.toString());
	}

}
