import BreezySwing.*;
import javax.swing.*;

public class MapGUI extends GBFrame{

	private JButton add; //Adds book to library
	private JButton issue; //Adds card to library
	private JButton checkout; //Checks out a book from the library
	private JButton returnBook; //Returns book to library
	private JButton books; //Prints list of titles
	private JButton isbn; //Prints list of ISBNs
	private JButton names; //Prints list of names
	private JButton cards; //Prints list of cards
	private JButton tbooks; //Prints list of books out
	private JButton reset; //Resets the GUI
	private JButton clear; //Clear the files
	
	private JTextArea output; //Where it is outputted
	
	private Library library; //Tracks the library
	
	/**
	 * This is the constructor method. It instantiates
	 * the instance variables
	 */
	public MapGUI(){
		
		add = addButton("Add",1,1,1,1);
		issue = addButton("Issue",1,2,1,1);
		checkout = addButton("Checkout",1,3,1,1);
		returnBook = addButton("Return",1,4,1,1);
		books = addButton("Books",5,1,1,1);
		isbn = addButton("ISBN",5,2,1,1);
		names = addButton("Names",5,3,1,1);
		cards = addButton("Card #s",5,4,1,1);
		tbooks = addButton("Out Books",5,5,1,1);
		reset = addButton("Reset",1,5,1,1);
		
		output= addTextArea("",2,1,5,3);
		clear = addButton("Clear",6,3,1,1);
		
		setSize(600,300);
		setVisible(true);
		
		library = new Library();
	}
	/**
	 * This method is called when a button is clicked
	 */
	public void buttonClicked(JButton buttonObj){
		if(buttonObj == add){
			library.addBook(new BookBox(this).getBook());
		}else if(buttonObj == issue){
			library.addCard(new CardBox(this).getCard());
		}else if(buttonObj == checkout){
			IOBox tempDialog = new IOBox(this);
			output.setText(library.checkout(tempDialog.getNumber(),tempDialog.getIsbn()));
		}else if(buttonObj == returnBook){
			IOBox tempDialog = new IOBox(this);
			output.setText(library.returnBook(tempDialog.getNumber(),tempDialog.getIsbn()));
		}else if(buttonObj == books){
			output.setText(library.alphabetizeBooks());
		}else if(buttonObj == isbn){
			output.setText(library.getIsbns());
		}else if(buttonObj == names){
			output.setText(library.alphabetizeCards());
		}else if(buttonObj == cards){
			output.setText(library.getCardNumbers());
		}else if(buttonObj == tbooks){
			output.setText(library.getBooksOut());
		}else if(buttonObj == clear){
			library.clear();
		}else if(buttonObj == reset){
			library.save();
			this.dispose();
			new MapGUI();	
		}
	}
	
	/**
	 * This is the main method it creates the actual GUI
	 * @param args
	 */
	public static void main(String[] args) {
		MapGUI theGUI = new MapGUI();
	}
}
	

