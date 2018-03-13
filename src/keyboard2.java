import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class keyboard2 implements KeyListener {
	JFrame f=new JFrame(); 
	
public static void main(String[] args) {
	keyboard2 run = new keyboard2();
	run.run();
}

void run() {
	f.addKeyListener(this);
	f.setVisible(true);
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
public void keyPressed(KeyEvent e) {
System.out.println("1");
speak("ouch");
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}






