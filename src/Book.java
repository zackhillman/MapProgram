import java.io.Serializable;

public class Book implements Serializable{

	private String isbn; //Tracks the book's ISBN
	private String title; //Tracks the book's title
	private String author; //Tracks the book's author
	private String borrower; //Tracks the book's borrower
	
	/**
	 * This is the constructor method. The instance variables 
	 * are instantiated from parameters
	 * @param i- the given ISBN
	 * @param t- the given title
	 * @param a- the given author
	 */
	public Book(String i, String t, String a){
		isbn = i;
		title = t;
		author = a;
		borrower = "";
	}
	
	/**
	 * This method gets the book's ISBN
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * This method gets the book's title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method gets the book's borrower
	 * @return the borrower
	 */
	public String getBorrower() {
		return borrower;
	}

	/**
	 * This method gets the books borrower
	 * @param- the book new borrower
	 */
	public void setBorrower(String b){
		borrower = b;
	}
	
	/**
	 * This method gets a string representation of the book
	 * @return- the books title
	 */
	public String toString(){
		return title;
	}
	
	
}
