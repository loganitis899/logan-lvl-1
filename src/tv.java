import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tv implements ActionListener {
	 
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();

	public static void main(String[] args) {
		tv run = new tv();
		run.run();
	}

	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setText("frogs");
		b2.setText("ducks");
		b3.setText("unicorns");
		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("jCfwR3EY2Nc");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/ + videoID ");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==b1) {
			showFrog();
		} else if(buttonPressed==b2) {
			showDucks();
		} else {
			showFluffyUnicorns();
		}

	}

}
