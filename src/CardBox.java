import BreezySwing.*;
import javax.swing.*;

public class CardBox extends GBDialog{

	private JLabel inputL; //Tells the user what to input
	private JTextField nameF; //Where the user inputs the name
	private IntegerField numberF; //Where the user inputs the number
	
	private JButton ok; //This button accepts and inputs the card
	private JButton cancel; //This button cancels
	
	private LibraryCard card; //This tracks the inputted card
	/**
	 * This is the constructor method. It instantiates
	 * the instance variables
	 */
	public CardBox(JFrame f) {
		super(f);
		
		inputL = addLabel("Input (Name, Number):",1,1,2,1);
		nameF = addTextField("",2,1,2,1);
		numberF = addIntegerField(0,3,1,2,1);
		
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
			card = new LibraryCard(numberF.getNumber(),nameF.getText());
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	/**
	 * This method gets the card
	 * @return- returns the inputted card
	 */
	public LibraryCard getCard(){
		return card;
	}

	
	
}
