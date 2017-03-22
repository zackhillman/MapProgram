import BreezySwing.*;
import javax.swing.*;

public class IOBox extends GBDialog{

	private JLabel inputL; //Tells user where to input the number & ISBN
	private IntegerField numberF; //Where the user inputs the number
	private JTextField isbnF; //Where the user inputs the ISBN
	
	private JButton ok; //When the user inputs the number & isbn
	private JButton cancel; //When the user wants to cancel
	
	private int number; //Tracks the number
	private String isbn; //Tracks the ISBN
	/**
	 * This is the constructor method. It instantiates
	 * the instance variables
	 */
	public IOBox(JFrame f) {
		super(f);
		
		inputL = addLabel("Input (Number, ISBN):",1,1,2,1);
		numberF = addIntegerField(0,2,1,2,1);
		isbnF = addTextField("",3,1,2,1);
		
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
			number = numberF.getNumber();
			isbn = isbnF.getText();
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	/**
	 * This method gets the number
	 * @return- the the number inputed
	 */
	public int getNumber(){
		return number;
	}
	
	/**
	 * This method gets the ISBN
	 * @return- the ISBN inputted
	 */
	public String getIsbn(){
		return isbn;
	}

	
	
}
