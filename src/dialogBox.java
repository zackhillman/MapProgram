import BreezySwing.*;
import javax.swing.*;

public class dialogBox extends GBDialog{

	private JLabel inputL;
	private JTextField isbnF;
	private JTextField titleF;
	private JTextField authorF;
	
	private JButton ok;
	private JButton cancel;
	
	public dialogBox(JFrame f, Book bk) {
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
	
	public void buttonClicked(JButton b){
		if(b == ok){
			bk = new Book()
		}else if(b == cancel){
			
		}
	}

	
	
}
