
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/logan-lvl-1/src/arnald.jpg";
	String secondImage = "/Users/league/Desktop/logan-lvl-1/src/chris.jpg";
	String thirdImage = "/Users/league/Desktop/logan-lvl-1/src/tom.jpg";

	Frame window = new Frame();
	int score = 0;
	
	private void startQuiz() {
		window.setSize(100,50);
			


String person = JOptionPane.showInputDialog("WHo iS ThIs??");

if(person.equals("arnold")){
	System.out.println("CoRreCt");
	score = score +1;
	System.out.println("yOuR sCoRe iS "+ score);
} else {
	System.out.println("WrOnG");
	System.out.println("yOuR sCoRe iS "+ score);
}
showNextImage();
window.setSize(50,100);

String personTwo = JOptionPane.showInputDialog("WHo iS ThIs??");
if(personTwo.equals("chris")){
	System.out.println("CoRreCt");
	score = score +1;
	System.out.println("yOuR sCoRe iS "+ score);
} else {
	System.out.println("WrOnG");
	System.out.println("yOuR sCoRe iS "+ score);
}

showNextImage();
window.setSize(50,100);



String personThree = JOptionPane.showInputDialog("WHo iS ThIs??");

if(personThree.equals("tom")){
	System.out.println("CoRreCt");
	score = score +1;
	System.out.println("yOuR sCoRe iS " + score);
} else {
	System.out.println("WrOnG");
	System.out.println("yOuR sCoRe iS " + score);
}
showNextImage();


		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


