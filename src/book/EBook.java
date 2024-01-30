package book;

public class EBook extends Book{
	
	private double fileSize;
	private String format;
	
	public EBook() {
		
	}
	
	public EBook(String title, String author, int publicationYear,double fileSize, String format) {
		super(title,author,publicationYear);
		this.fileSize = fileSize;
		this.format = format;
	}

//	@Override
//	public String toString() {
//		return "FileSize : [" + fileSize + " MB] , Format : [" + format + "]";
//	}
	
	public void displayInfo( ) {
//		System.out.println(toString());
		System.out.println("FileSize : [" + fileSize + " MB] , Format : [" + format + "]");
	}

}
