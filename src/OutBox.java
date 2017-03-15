import BreezySwing.*;
import javax.swing.*;

public class OutBox extends GBDialog{

	private JLabel inputL;
	private JTextField F;
	private IntegerField numberF;
	private JTextField isbnF;
	
	private JButton ok;
	private JButton cancel;
	
	private int number;
	private String isbn;
	
	public OutBox(JFrame f) {
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
			number = numberF.getNumber();
			isbn = isbnF.getText();
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getIsbn(){
		return isbn;
	}

	
	
}
