import BreezySwing.*;
import javax.swing.*;

public class MapGUI extends GBFrame{

	private JButton add;
	private JButton issue;
	private JButton checkout;
	private JButton returnBook;
	private JButton books;
	private JButton isbn;
	private JButton names;
	private JButton cards;
	private JButton tbooks;
	private JButton reset;
	
	private JTextArea output;
	
	public MapGUI(){
		
		add = addButton("Add",1,1,1,1);
		issue = addButton("Issue",1,2,1,1);
		checkout = addButton("Checkout",1,3,1,1);
		returnBook = addButton("Return",1,4,1,1);
		books = addButton("Books",5,1,1,1);
		isbn = addButton("ISBN",5,2,1,1);
		names = addButton("Names",5,3,1,1);
		cards = addButton("Card #s",5,4,1,1);
		tbooks = addButton("All Books",5,5,1,1);
		reset = addButton("Reset",1,5,1,1);
		
		output= addTextArea("",2,1,5,3);
		
		setSize(600,300);
		setVisible(true);
		
	}
	/**
	 * This method is called when a button is clicked
	 */
	public void buttonClicked(JButton buttonObj){
		if(buttonObj == add){
			
		}else if(buttonObj == issue){
			
		}else if(buttonObj == reset){
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
	

