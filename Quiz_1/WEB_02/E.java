class Book{
	String name;
	int ISBN;
	String author;
	String publisher;
	public Book (String name, int ISBN, String author,String publisher){
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.publisher = publisher;
	}
}
class BookTest {
public static void main(String[] args)
{
Book test[] = new Book[13];
test[1] = new Book();
test[1].getBookInfo();
}

public class E {
    public static void main ( String args[] ) {
    }
}