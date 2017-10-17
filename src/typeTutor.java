import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typeTutor {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l = new JLabel();
char currentLetter;
public static void main(String[] args) {
	typeTutor type = new typeTutor();
	type.run();
	
	
}
public void run() {
	currentLetter=generateRandomLetter();
	String letterString = Character.toString(currentLetter);
	f.setVisible(true);
	f.add(p);
	p.add(l);
	f.setTitle("Type or Die");
	f.setSize(400, 200);
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
public void start() {
	l.setText("");
	l.setText(letterString);
}
}
