public class interface2 {
    public static void main(String args[]) {
	Politician p = new Politician();
	Coach c = new Coach();
	Lecturer l = new Lecturer();
	p.speak();
	c.speak();
	l.speak();

	Speaker sp = null;
	System.out.println("\n\nsp pointing to Politician");
	sp = new Politician();
	sp.speak();
	System.out.println("\n\nsp pointing to Coach");
	sp = new Coach();
	sp.speak();
	System.out.println("\n\nsp pointing to Lecturer");
	sp = new Lecturer();
	sp.speak();
    }
}


//Interface Speaker
interface Speaker {
public void speak( );
}

//Politician Class
class Politician implements Speaker {
public void speak(){
System.out.println("Talk politics");
}
}

//Coach Class
class Coach implements Speaker {
public void speak(){
System.out.println("Sports Talks");
}
}

//Lecturer Class
class Lecturer implements Speaker {
public void speak(){
System.out.println("Web Desing and Development Talks");
}
}