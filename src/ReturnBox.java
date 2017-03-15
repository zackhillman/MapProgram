import BreezySwing.*;
import javax.swing.*;

public class ReturnBox extends GBDialog{

	private JLabel inputL;
	private JTextField isbnF;
	private IntegerField numberF;
	
	private JButton ok;
	private JButton cancel;
	
	private String isbn;
	private int number;
	
	public ReturnBox(JFrame f) {
		super(f);
		
		inputL = addLabel("Input (Number, ISBN):",1,1,2,1);
	
		numberF = addIntegerField(0,2,1,2,1);
		isbnF = addTextField("",3,1,2,1);

		ok = addButton("Ok",5,1,1,1);
		cancel = addButton("Cancel",5,2,1,1);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public void buttonClicked(JButton b){
		if(b == ok){
			isbn = isbnF.getText();
			number = numberF.getNumber();
			
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	
	public String getIsbn(){
		return isbn;
	}

	public int getNumber(){
		return number;
	}

	
	
}
