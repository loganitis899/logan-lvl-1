import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pTest1 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton(); 
	JTextField text = new JTextField(20);
public static void main(String[] args) {
	pTest1 run = new pTest1();
	run.run();
	
	
}
void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(text);
	label.setText("What room has no windows or doors?");
	button1.setText("Submit");
	button2.setText("hint");
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	}
	

@Override
public void actionPerformed(ActionEvent e) {
	JButton BP = (JButton)e.getSource();
	if(BP.getText().equals("Submit")) {
		if(text.getText().equals("a mushroom")) {
			JOptionPane.showMessageDialog(null, "U Win! >_<");
		} else {
			JOptionPane.showMessageDialog(null, "Try Again :-: ");
		}
	}
 if(BP.getText().equals("hint")){
	 JOptionPane.showMessageDialog(null, "This room is very small and can be eaten");
 }
	
}
}
