
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jokess implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton leftButton=new JButton();
	JButton rightButton=new JButton();
	
	public static void main(String[] args){
		jokess joke=new jokess();
	}
	jokess(){
		frame.add(panel);
		frame.setVisible(true);
		panel.add(leftButton);
		panel.add(rightButton);
		leftButton.setText("joke");
		rightButton.setText("punchline");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		frame.pack();
	}
		
		
		
	
		
	
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==leftButton){
	System.out.println("why did the chick eat the brother?");
			
		}else{
			System.out.println("cuz he did");
		}
	}
	

}
