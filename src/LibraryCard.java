import java.io.Serializable;
import java.util.HashSet;

public class LibraryCard implements Serializable{

	private Integer cardNumber; //Tracks the card's number
	private String name; //Tracks the name on the card
	private HashSet<Book> booksOnLoan; //Set of books card checked out
	
	/**
	 * This is the constructor method. The instance variables are
	 * instantiated.
	 * @param cn - the given card number
	 * @param n - the given name
	 */
	public LibraryCard(Integer cn, String n){
		cardNumber = cn;
		name = n;
		booksOnLoan = new HashSet<Book>();
	}
	
	/**
	 * This method checks out a book on the card
	 * @param b - the book being checked out
	 */
	public void checkOut(Book b){
		booksOnLoan.add(b);
	}
	/**
	 * This method returns a book on the card
	 * @param b - the books being returned
	 */
	public void returnBook(Book b) {
		booksOnLoan.remove(b);
		
	}

	/**
	 * This method gets the name on the card
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method gets the books checked out
	 * @return the books
	 */
	public HashSet<Book> getBooks() {
		return booksOnLoan;
	}
	
	/**
	 * This method gets the card number
	 * @return - card number
	 */
	public Integer getNumber(){
		return cardNumber;
	}
}

