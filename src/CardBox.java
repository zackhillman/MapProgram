import BreezySwing.*;
import javax.swing.*;

public class CardBox extends GBDialog{

	private JLabel inputL;
	private JTextField nameF;
	private IntegerField numberF;
	
	private JButton ok;
	private JButton cancel;
	
	private LibraryCard card;
	
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
	
	public void buttonClicked(JButton b){
		if(b == ok){
			card = new LibraryCard(numberF.getNumber(),nameF.getText());
			dispose();
		}else if(b == cancel){
			dispose();
		}
	}
	
	public LibraryCard getCard(){
		return card;
	}

	
	
}
