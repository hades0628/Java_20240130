package book;

public class Book {

	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

//	@Override
//	public String toString() {
//		return "Title : [" + title + "] , Author : [" + author + "] , Year : [" + publicationYear + "]";
//	}
	
	public void displayInfo() {
		super.toString();
//		System.out.println(toString());
		System.out.println( "Title : [" + title + "] , Author : [" + author + "] , Year : [" + publicationYear + "]");
	}
	
	
}
