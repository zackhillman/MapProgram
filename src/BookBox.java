import BreezySwing.*;
import javax.swing.*;

public class BookBox extends GBDialog{

	private JLabel inputL; //Tells you where to input the isbn, title & author
	private JTextField isbnF; //Where the user inputs ISBN
	private JTextField titleF; //Where the user inputs Title
	private JTextField authorF; //Where the user inputs Author
	
	private JButton ok; //User accepts input
	private JButton cancel; //user declines input
	
	private Book book; //Tracks the inputted book
	/**
	 * This is the constructor method. It instantiates
	 * the instance variables
	 */
	public BookBox(JFrame f) {
		super(f);
		
		inputL = addLabel("Input (ISBN, Title, Author):",1,1,2,1);
		isbnF = addTextField("",2,1,2,1);
		titleF = addTextField("",3,1,2,1);
		authorF = addTextField("",4,1,2,1);
		
		ok = addButton("Ok",5,1,1,1);
		cancel = addButton("Cancel",5,2,1,1);
		
		setSize(300,300);
		setVisible(true);
		
	}
	/**
	 * This method is called when a button is clicked
	 */
	public void buttonClicked(JButton b){
		if(b == ok){
			book = new Book(isbnF.getText(),titleF.getText(),authorF.getText());
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	/**
	 * This method gets the book
	 * @return- the inputted book
	 */
	public Book getBook(){
		return book;
	}

	
	
}
