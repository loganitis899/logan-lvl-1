import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class keyboard implements KeyListener {
	JFrame frame = new JFrame();
	int score = 0;

	public static void main(String[] args) {
		keyboard run = new keyboard();
		run.run();
	}

	public void run() {
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		
		speak("ouch");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
