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

	public void setName (String name){
		this.name = name;
	}
	public String getColor () {
		return name;
	}

	public void setISBN (int ISBN){
		this.ISBN = ISBN;
	}
	public int getISBN () {
		return ISBN;
	}

	public void setAuthor (String author){
		this.author = author;
	}
	public String getAuthor () {
		return author;
	}

	public void setPublisher (String publisher){
		this.publisher = publisher;
	}
	public String getPublisher () {
		return publisher;
	}
	public String getBookInfo() {
		        return "Name= " + name + "\nISBN= " + ISBN + "\nAuthor= " + author + "\nPublisher= " + publisher + "\n";
    }
}
class BookTest {
	public static void main(String[] args){
	Book test[] = new Book[13];
	test[1] = new Book("Atomic Habits", 1234, "James Clear", "Avery Publishing Group");
	System.out.println("Book 01 Information: \n" + test[1].getBookInfo() );
	test[2] = new Book("Kaiser O Kusra", 777, "Naseem hijazi", "Urdu Bazar");
	System.out.println("\nBook 02 Information: \n" + test[2].getBookInfo() );
	}
}