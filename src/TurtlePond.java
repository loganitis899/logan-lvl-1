
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtlePond implements KeyEventDispatcher {

	// 1. Set a location for the cookie
	int cookieX=400;
	int cookieY=240;

	// 2. Choose the speed you want the Tortoise to go at
	int speed=10;
	
	void setup() {
		// 3. Edit this intro message to your own style
		JOptionPane.showMessageDialog(null, "Move the turtle with the arrow keys to find the hidden cookie.\nYou'll get warmer the closer you get.\n\nHurry or it'll die of hunger!");
		
		// 4. For debugging purposes, show the cookie. The user won’t see this.

	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left at the specified speed (3 lines of code)
		Tortoise.turn(-90);
		Tortoise.move(speed);
		
	}

	private void goRight() {
		// 6. use the speed variable to make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(speed);
		
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
double d;
int distanceX;
int distanceY;

distanceX=tortoiseLocationX-cookieX;
distanceY=tortoiseLocationY-cookieY;
d=Math.sqrt(distanceY*distanceY+distanceX*distanceX);
		// 7. If the Tortoise is within 100 pixels of the food, set the background color to yellow
if(d>100) {
	Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
}
if(d<=100) {
	Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.Yellow);
} 
if(d<=50) {
	Tortoise.getBackgroundWindow().setBackground(PenColors.Oranges.Orange);
}
if(d<=20) {
	Tortoise.getBackgroundWindow().setBackground(PenColors.Reds.Red);
}  
if(d<=5) {
	JOptionPane.showMessageDialog(null, "YOu FoUNd iT!!1.!");
	System.exit(0);
}
		// 8. If the Tortoise is within 50 pixels of the food, set the background color to orange

		// 9. If the Tortoise is within 20 pixels of the food, set the background color to red

		// 10. If the Tortoise is within 5 pixels of the cookie, make a pop-up to tell them they found it
				
		// 11. If more than 20 seconds have elapsed, tell them the turtle died of hunger!
if(getTimeElapsed()>20) {
	JOptionPane.showMessageDialog(null, "RiP. YoU DEd BOiI! ( ͡ಠ ʖ̯ ͡ಠ)");
	System.exit(0);
	
}
		// 12. If the Tortoise crosses it's own path, tell them they failed and move them back to the beginning
if(wasHereBefore(tortoiseLocationX,tortoiseLocationY)) {
	JOptionPane.showMessageDialog(null, "u LUoSE!11!!1!,,!/");
	Tortoise.setX(400);
	Tortoise.setY(400);

}
	}
	
	private long getTimeElapsed() {
		 Date currentTime = new Date();
		 return (currentTime.getTime() - startTime.getTime())/1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}



