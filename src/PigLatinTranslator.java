import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	public static void main(String[]args){
		PigLatinTranslator start = new PigLatinTranslator();
		start.start();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField word = new JTextField(10);
	JTextField latin = new JTextField(10);
	JButton convert = new JButton("Convert");

	public void start() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(word);
		panel.add(convert);
		panel.add(latin);
		convert.addActionListener(this);
		frame.pack();
	}
	


	private static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split) + "-" + word.substring(0, split) + "ay";
	}

	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {

			while (i < s.length() && !isLetter(s.charAt(i))) {
				latin = latin + s.charAt(i);
				i++;
			}

			if (i >= s.length())
				break;

			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
				i++;
			}

			int end = i;
			latin = latin + pigWord(s.substring(begin, end));
		}
		return latin;
	}

	private static int firstVowel(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				return i;
		return 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	 String pigLatin=translate(word.getText());
	 latin.setText(pigLatin);
	 

	}

}
