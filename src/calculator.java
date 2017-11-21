import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton a = new JButton();
JButton s = new JButton();
JButton m = new JButton();
JButton d = new JButton();
JTextField t1 = new JTextField(3);
JTextField t2 = new JTextField(3);
JLabel answer = new JLabel();
	public static void main(String[] args) {
		calculator calc = new calculator();
		calc.run();
	}
	public void run() {
		f.setVisible(true);
		f.add(p);
		p.add(t1);
		p.add(t2);
		p.add(a);
		p.add(s);
		p.add(m);
		p.add(d);
		p.add(answer);
		a.setText("add");
		s.setText("subtract");
		m. setText("multiply");
		d.setText("divide");
		f.pack();
a.addActionListener(this);
s.addActionListener(this);
m.addActionListener(this);
d.addActionListener(this);
		
	
	}
	
	public double add(double one, double two) {
		return(one+two);
	}
	public double subtract(double one, double two) {
		return(one-two);
	}
	public double multiply(double one, double two) {
		return(one*two);
	}
	public double divide(double one, double two) {
		return(one/two);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton BP = (JButton)e.getSource();
		if(BP.getText().equals("add")) {
			double temp = add(Double.parseDouble(t1.getText()),Double.parseDouble(t2.getText()));
			String tempString = Double.toString(temp);
			answer.setText(tempString);
			f.pack();
		} else if(BP.getText().equals("subtract")) {
			double temp = subtract(Double.parseDouble(t1.getText()),Double.parseDouble(t2.getText()));
			String tempString = Double.toString(temp);
			answer.setText(tempString);
			f.pack();
		} else if(BP.getText().equals("multiply")) {
			double temp = multiply(Double.parseDouble(t1.getText()),Double.parseDouble(t2.getText()));
			String tempString = Double.toString(temp);
			answer.setText(tempString);
			f.pack();
		} else if(BP.getText().equals("divide")) {
			double temp = divide(Double.parseDouble(t1.getText()),Double.parseDouble(t2.getText()));
			String tempString = Double.toString(temp);
			answer.setText(tempString);
			f.pack();
		} 

		
	}
}
