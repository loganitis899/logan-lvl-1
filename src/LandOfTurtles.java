import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;



public class LandOfTurtles {
	JFrame frame = new JFrame();
	MultiTurtlePanel panel = new MultiTurtlePanel();

	public static void main(String[] args) {
		
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		LandOfTurtles run = new LandOfTurtles();
		run.run();
		
// 1. Create a frame & make it visible

		// 2. Add the panel to the frame
		
		// 3. Set the background image of the panel to the Galapagos Islands 

		// 4. Instantiate a Turtle 

// 5. Add the turtle to the panel 
		
		// 6. Put 50 Turtles on the beach

	}
	public void run(){
		frame.setVisible(true);
		frame.add(panel);
		panel.setBackgroundImage("https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg");
		frame.pack();
	
	}
}
