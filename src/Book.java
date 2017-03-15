

public class Book {

	private String isbn;
	private String title;
	private String author;
	private String borrower;
	
	public Book(String i, String t, String a){
		isbn = i;
		title = t;
		author = a;
		borrower = null;
	}
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the borrower
	 */
	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String b){
		borrower = b;
	}
	
	public String toString(){
		return title;
	}
	
	
}
