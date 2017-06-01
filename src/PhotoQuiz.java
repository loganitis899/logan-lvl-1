
 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class PhotoQuiz {
 
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
 
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
 String penguin="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkdgGVokqUHMNgqISdTGq72xaoA_rZXN2-1qfqCjpOuwPYC8ButQ";
		// 2. create a variable of type "Component" that will hold your image
 Component nep=createImage(penguin);
		// 3. use the "createImage()" method below to initialize your Component
 
		// 4. add the image to the quiz window
 quizWindow.add(nep);
		// 5. call the pack() method on the quiz window
 quizWindow.pack();
		// 6. ask a question that relates to the image
 String yuno=JOptionPane.showInputDialog("is this great? yes or no?");
		// 7. print "CORRECT" if the user gave the right answer
 if(yuno.equals("yes")){
	 JOptionPane.showMessageDialog(null, "CORRECT!!");
 }else{
	 JOptionPane.showMessageDialog(null, "*wrong");
 }
		// 8. print "INCORRECT" if the answer is wrong
 
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
 quizWindow.remove(nep);
 String odd="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTtIQcJ3m_eeNamccLzIj0aCgbNQ6I5_extFRkhskQczYQoIxibg";
 Component nea=createImage(odd);
 quizWindow.add(nea);
 quizWindow.pack();
		// 10. find another image and create it (might take more than one line of code)
 
		// 11. add the second image to the quiz window
 
		// 12. pack the quiz window
 
		// 13. ask another question
 String noyu=JOptionPane.showInputDialog("is THIS great?");
 if(noyu.equals("yes")){
	JOptionPane.showMessageDialog(null, "CORRECT!"); 
 }else{
	 JOptionPane.showMessageDialog(null, "wrong");
 }
		// 14+ check answer, say if correct or incorrect, etc.
 quizWindow.pack();
	}
 
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
 
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
 
 
 
 
 
