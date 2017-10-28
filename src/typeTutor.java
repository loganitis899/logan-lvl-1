import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typeTutor implements KeyListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l = new JLabel();
char currentLetter;
int r;
public static void main(String[] args) {
	typeTutor type = new typeTutor();
	type.run();
	type.start();
	
	
	
}
public void run() {
	
	
	f.setVisible(true);
	f.add(p);
	p.add(l);
	f.setTitle("Type or Die");
	f.setSize(400, 200);
	f.addKeyListener(this);
	
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
public void start() {
	currentLetter=generateRandomLetter();
	l.setText("");
	l.setText(currentLetter+"");
	l.setFont(l.getFont().deriveFont(28.0f));
	l.setHorizontalAlignment(JLabel.CENTER);


}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {


System.out.println("you typed: "+e.getKeyChar()+"");
	if(e.getKeyChar()==currentLetter) {
		p.setBackground(Color.GREEN);
		r++;
	} else {
		p.setBackground(Color.RED);
	}
	if(r%10==0) {showTypingSpeed(r);
	}
	start();
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

}
