import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fart implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();

public static void main(String[] args) {
	fart fart = new fart();
	fart.run();
}
public void run() {
	f.setVisible(true);
	f.add(p);
	p.add(b1);
	p.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.pack();
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}


@Override
public void actionPerformed(ActionEvent e) {
	JButton BP = (JButton)e.getSource();
	if(BP==b1) {
		playSound("1.wav");		
	} else {
		playSound("2.wav");
	}
	
}
}
