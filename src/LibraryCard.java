import java.util.HashSet;

public class LibraryCard {

	private Integer cardNumber;
	private String name;
	private HashSet<Book> booksOnLoan;
	
	public LibraryCard(Integer cn, String n){
		cardNumber = cn;
		name = n;
		booksOnLoan = new HashSet<Book>();
	}
	
	public void checkOut(Book b){
		booksOnLoan.add(b);
	}
	
	public void returnBook(Book b) {
		booksOnLoan.remove(b);
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the books
	 */
	public HashSet<Book> getBooks() {
		return booksOnLoan;
	}
	
	public Integer getNumber(){
		return cardNumber;
	}

	
	
	
}

