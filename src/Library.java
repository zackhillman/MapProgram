import java.util.*;

public class Library {

	private HashMap<String,Book> books;
	private HashMap<Integer, LibraryCard> libraryCards;
	
	public Library(){
		
		books = new HashMap<String,Book>();	
		libraryCards = new HashMap<Integer,LibraryCard>();
	}
	
	public void addBook(Book b){
		books.put(b.getIsbn(),b);
	}
	
	public void addCard(LibraryCard c){
		libraryCards.put(c.getNumber(), c);
	}
	
	public void checkout(int num, String isbn){
		Book b = books.get(isbn);
		LibraryCard c =  libraryCards.get(num);
		b.setBorrower(c.getName());
		c.checkOut(b);
	}
	
	public void returnBook(int num, String isbn){
		Book b = books.get(isbn);
		LibraryCard c =  libraryCards.get(num);
		b.setBorrower("");
		c.returnBook(b);
		
	}
	
	public String alphabetizeBooks(){
		TreeSet<String> abooks = new TreeSet<String>();
		for(Book b: books.values()){
			abooks.add(b.getTitle());
		}
		return abooks.toString();
	}
	
	public String getIsbns(){
		return books.keySet().toString();	
	}
	
	public String alphabetizeCards(){
		TreeSet<String> acards = new TreeSet<String>();
		for(LibraryCard c: libraryCards.values()){
			acards.add(c.getName());
		}
		return acards.toString();
	}
	
	public String getCardNumbers(){
		return libraryCards.keySet().toString();	
	}
	
	public String getBooksOut(){
		Set<Book> booksOut = new HashSet<Book>();
		for(LibraryCard c : libraryCards.values()){
			booksOut.addAll(c.getBooks());
		}
		return booksOut.toString();
	}
	
}
