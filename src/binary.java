import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//We’re going to make an application that converts binary codes (8-bits) into letters.

//You’ll need a JFrame and a JPanel.

//On the panel, put two text fields and a button. A text field is made like this:
//JTextField answer = new JTextField(20);

//It may look like this or you might have a better layout in mind.


//ere is a method that will do the conversion for you.
public class binary implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField binary = new JTextField(8);
	JTextField string = new JTextField(1);
	JButton convert = new JButton("convert");
	
	public static void main(String[] args) {
		binary start = new binary();
		start.start();
	}
 String convert(String binary) {
   	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }
public void start() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(binary);
	panel.add(convert);
	panel.add(string);
	frame.pack();
	convert.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {

	String bNumbers = convert(binary.getText());
	string.setText(bNumbers);
}

	
	
	

}


