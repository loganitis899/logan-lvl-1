import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class kandyman implements ActionListener {
	int i=0;
	JFrame Frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	public static void main(String[] args) {
		kandyman man = new kandyman();
		man.run();
	}
public void run() {
	Frame.setVisible(true);
	Frame.add(panel);
	panel.add(button);
	button.setText("click me face!");
	button.addActionListener(this);
	Frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(i==4) {
showPictureFromTheInternet("https://f4.bcbits.com/img/a0857045674_5.jpg");
playSound(0);
i=0;

	} else {
		playSound(1);
	}
	
	i=i+1;
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}

static final int CREEPY = 0;
static final int SCREAM = 1;

public static void playSound(int whichSound) {
File soundFile = null;
	 if (whichSound == CREEPY)
		 soundFile = new File(
				 "/Users/league/Desktop/logan-lvl-1/src/creeps.wav");
	 else if (whichSound == SCREAM)
		 soundFile = new File(
				 "/Users/league/Desktop/logan-lvl-1/src/wow.wav");
	 try {
		 AudioInputStream audioInputStream = AudioSystem
				 .getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
		 Thread.sleep(3400);
	 } catch (Exception ex) {
		 ex.printStackTrace();
	 }

}


}
