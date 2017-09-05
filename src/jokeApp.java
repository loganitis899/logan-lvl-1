import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jokeApp {
	public static void main(String[] args) {

		jokeApp joke = new jokeApp();

	}

	JFrame frame = new JFrame();
	JButton bat = new JButton();
	JButton jeff = new JButton();

	public jokeApp() {

		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.add(bat);
		frame.add(jeff);

		
	}

}
