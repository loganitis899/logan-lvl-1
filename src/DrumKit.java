
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel drumLabelWithImageTwo;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		

		// 2. Make the frame visible
		frame.setVisible(true);

		// 3. Set the size of the frame
		frame.setSize(100, 100);
		// 4. Set the title of the frame
		frame.setTitle("drumkit");
		// 5. Make a JPanel and initialize it.

		// 6. Add the panel to the frame. (The panel is invisible.)
		frame.add(panel);
		
		panel.setSize(100,100);
		//panelTwo.setSize(100,100);
		
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
		// 8. Put the name of your image in a String variable.
		String drum = "Drum_Kit.png";
		String drumTwo = "river-3.jpg";
		// 9. Edit the next line to use your String variable
		// drumLabelWithImage = createLabelImage(drumImageString);
		drumLabelWithImage = createLabelImage(drum);
		drumLabelWithImageTwo= createLabelImage(drumTwo);
		// 10. Add the image to the panel
		panel.add(drumLabelWithImage);
		panel.add(drumLabelWithImageTwo);

		panel.setVisible(true);
		
		// 11. Set the layout of the panel to "new GridLayout()"
		panel.setLayout(new GridLayout());
		
		// 12. call the pack() method on the frame
		frame.pack();
		// 13. add a mouse listener to drumLabelWithImage.
		drumLabelWithImage.addMouseListener(this);
		drumLabelWithImageTwo.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To
		// download it, log in as leagueofamazing/code4life.

		if(drumClicked.equals(drumLabelWithImage)){
				String sound = "sound2.wav";
		playSound(sound);
		System.out.println("left Button Clicked!");
		}else{
			String soundTwo = "sound3.wav";
			playSound(soundTwo);
		System.out.println("right Button clicked!");
		}
		
	

		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
