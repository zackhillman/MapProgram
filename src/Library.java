import java.io.*;
import java.util.*;

public class Library {

	private HashMap<String,Book> books; //Tracks the books in the library
	private HashMap<Integer, LibraryCard> libraryCards; //Tracks the cards in the library
	
	/**
	 * This is the constructor method. It instantiates the instance variables
	 */
	public Library(){
		
		books = new HashMap<String,Book>();	
		libraryCards = new HashMap<Integer,LibraryCard>();
		try{
			loadInfo();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	/**
	 * This method adds a book to the library
	 * @param b - the book being added
	 */
	public void addBook(Book b){
		books.put(b.getIsbn(),b);
		save();
	}
	/**
	 * This method adds a card to the library
	 * @param c - the card being added
	 */
	public void addCard(LibraryCard c){
		libraryCards.put(c.getNumber(), c);
		save();
	}
	/**
	 * This method checks out a book from the library
	 * @param num- the card numbers
	 * @param isbn- the ISBN of the book
	 */
	public void checkout(int num, String isbn){
		Book b = books.get(isbn);
		LibraryCard c =  libraryCards.get(num);
		b.setBorrower(c.getName());
		c.checkOut(b);
	}
	/**
	 * This method returns a book to the library
	 * @param num- the card numbers
	 * @param isbn- the ISBN of the book
	 */
	public void returnBook(int num, String isbn){
		Book b = books.get(isbn);
		LibraryCard c =  libraryCards.get(num);
		b.setBorrower("");
		c.returnBook(b);
		
	}
	/**
	 * This method alphabetizes the books by title
	 * @return- list of books alphabetized
	 */
	public String alphabetizeBooks(){
		TreeSet<String> abooks = new TreeSet<String>();
		for(Book b: books.values()){
			abooks.add(b.getTitle());
		}
		return abooks.toString();
	}
	/**
	 * This method gets the list of ISBNs in the library
	 * @return- the list of ISBNs
	 */
	public String getIsbns(){
		return books.keySet().toString();	
	}
	/**
	 * This method alphabetizes the cards by name
	 * @return- list of cards alphabetized
	 */
	public String alphabetizeCards(){
		TreeSet<String> acards = new TreeSet<String>();
		for(LibraryCard c: libraryCards.values()){
			acards.add(c.getName());
		}
		return acards.toString();
	}
	/**
	 * This method lists all of the card numbers in the library
	 * @return- a list of card numbers
	 */
	public String getCardNumbers(){
		return libraryCards.keySet().toString();	
	}
	/**
	 * This method gets the list of books checked out
	 * @return- a string of all the books out
	 */
	public String getBooksOut(){
		Set<Book> booksOut = new HashSet<Book>();
		for(LibraryCard c : libraryCards.values()){
			booksOut.addAll(c.getBooks());
		}
		return booksOut.toString();
	}
	/**
	 * This method clears the two files
	 */
	public void clear(){
		(new File("bookfile.dat")).delete();
		(new File("cardholders.dat")).delete();
	}
	
	/**
	 * This method writes an object to file
	 * @param o - the object to write onto the file
	 */
	private void save() {
		try {
			FileOutputStream BookFile = new FileOutputStream("bookfile.dat");
			FileOutputStream CardHolders = new FileOutputStream("cardholders.dat");

			ObjectOutputStream outputBooks = new ObjectOutputStream(BookFile);
			ObjectOutputStream outputCards = new ObjectOutputStream(CardHolders);


			outputBooks.writeObject(books);
			outputCards.writeObject(libraryCards);

			BookFile.close();
			CardHolders.close();
			outputBooks.close();
			outputCards.close();
			
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	/**
	 * This method loads the maps from the file
	 */
	private void loadInfo() {
		try {
			FileInputStream BookFile = new FileInputStream("bookfile.dat");
			FileInputStream CardHolders = new FileInputStream("cardholders.dat");

			ObjectInputStream inputBooks = new ObjectInputStream(BookFile);
			ObjectInputStream inputCards = new ObjectInputStream(CardHolders);
			
			books = (HashMap<String, Book>) inputBooks.readObject();
			libraryCards = (HashMap<Integer, LibraryCard>) inputCards.readObject();
			 
			BookFile.close();
			CardHolders.close();
			inputBooks.close();
			inputCards.close();
		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}
	
}
