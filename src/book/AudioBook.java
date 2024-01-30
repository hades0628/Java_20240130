package book;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	public AudioBook() {
		
	}
	
	public AudioBook(String title, String author, int publicationYear, double length, String narrator) {
		super(title,author,publicationYear);
		this.length = length;
		this.narrator = narrator;
	}

//	@Override
//	public String toString() {
//		return "Length : [" + length + "hours] " + ", Narrator : [" + narrator + "]";
//	}
	
	public void displayInfo() {
	//	System.out.println(toString());
		System.out.println("Length : [" + length + "hours] " + ", Narrator : [" + narrator + "]");
	}

}
