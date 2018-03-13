import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Date;
import java.util.Random;
public class whack implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton one = new JButton();
JButton two = new JButton();
JButton three = new JButton();
JButton four = new JButton();
JButton five = new JButton();
JButton six = new JButton();
JButton seven = new JButton();
JButton eight = new JButton();
JButton nine = new JButton();
JButton ten = new JButton();
JButton eleven = new JButton();
JButton twelve = new JButton();
JButton thirteen = new JButton();
JButton fourteen = new JButton();
JButton fifteen = new JButton();
JButton sixteen = new JButton();
JButton seventeen = new JButton();
JButton eighteen = new JButton();
JButton nineteen = new JButton();
JButton twenty = new JButton();
JButton twentyone = new JButton();
JButton twentytwo = new JButton();
JButton twentythree = new JButton();
JButton twentyfour = new JButton();

int w;
int hit;
Date timeAtStart = new Date();

public static void main(String[] args) {
	whack whack = new whack();
	whack.run();
	whack.draw();

	
}
public void run() {
	f.add(p);
	p.add(one);
	p.add(two);
	p.add(three);
	p.add(four);
	p.add(five);
	p.add(six);
	p.add(seven);
	p.add(eight);
	p.add(nine);
	p.add(ten);
	p.add(eleven);
	p.add(twelve);
	p.add(thirteen);
	p.add(fourteen);
	p.add(fifteen);
	p.add(sixteen);
	p.add(seventeen);
	p.add(eighteen);
	p.add(nineteen);
	p.add(twenty);
	p.add(twentyone);
	p.add(twentytwo);
	p.add(twentythree);
	p.add(twentyfour);
	
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	ten.addActionListener(this);
	eleven.addActionListener(this);
	twelve.addActionListener(this);
	thirteen.addActionListener(this);
	fourteen.addActionListener(this);
	fifteen.addActionListener(this);
	sixteen.addActionListener(this);
	seventeen.addActionListener(this);
	eighteen.addActionListener(this);
	nineteen.addActionListener(this);
	twenty.addActionListener(this);
	twentyone.addActionListener(this);
	twentytwo.addActionListener(this);
	twentythree.addActionListener(this);
	twentyfour.addActionListener(this);
	
}
public void draw() {
	Random rand = new Random();
	int  n = rand.nextInt(25)+1;
	System.out.println(n);
	
	one.setText("Dont click me");
	two.setText("Dont click me");
	three.setText("Dont click me");
	four.setText("Dont click me");
	five.setText("Dont click me");
	six.setText("Dont click me");
	seven.setText("Dont click me");
	eight.setText("Dont click me");
	nine.setText("Dont click me");
	ten.setText("Dont click me");
	eleven.setText("Dont click me");
	twelve.setText("Dont click me");
	thirteen.setText("Dont click me");
	fourteen.setText("Dont click me");
	fifteen.setText("Dont click me");
	sixteen.setText("Dont click me");
	seventeen.setText("Dont click me");
	eighteen.setText("Dont click me");
	nineteen.setText("Dont click me");
	twenty.setText("Dont click me");
	twentyone.setText("Dont click me");
	twentytwo.setText("Dont click me");
	twentythree.setText("Dont click me");
	twentyfour.setText("Dont click me");
	
	f.setSize(300, 400);
	f.setVisible(true);

	switch(n) {
	case 1:
		one.setText("    Click me    ");
		break;
	case 2:
		two.setText("    Click me    ");
		break;
	case 3:
		three.setText("    Click me    ");
		break;
	case 4:
		four.setText("    Click me    ");
		break;
	case 5: 
		five.setText("    Click me    ");
		break;
	case 6:
		six.setText("    Click me    ");
		break;
	case 7:
		seven.setText("    Click me     ");
		break;
	case 8: 
		eight.setText("    Click me     ");
		break;
	case 9:
		nine.setText("    Click me     ");
		break;
	case 10:
		ten.setText("    Click me     ");
		break;
	case 11:
		eleven.setText("    Click me     ");
		break;
	case 12:
		twelve.setText("    Click me     ");
		break; 
	case 13:
		thirteen.setText("    Click me     ");
		break;
	case 14:
		fourteen.setText("    Click me     ");
		break;
	case 15:
		fifteen.setText("    Click me     ");
		break;
	case 16:
		sixteen.setText("    Click me     ");
		break;
	case 17:
		seventeen.setText("    Click me     ");
		break;
	case 18:
		eighteen.setText("    Click me     ");
		break;
	case 19:
		nineteen.setText("    Click me     ");
		break;
	case 20: 
		twenty.setText("    Click me     ");
		break;
	case 21:
		twentyone.setText("    Click me     ");
		break;
	case 22:
		twentytwo.setText("    Click me     ");
		break;
	case 23:
		twentythree.setText("    Click me     ");
		break; 
	case 24:
		twentyfour.setText("    Click me     ");
		break;
	
		
	}
	
	
}

void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}

}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();

JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
System.exit(0);
}



@Override
public void actionPerformed(ActionEvent e) {	
	JButton BP = (JButton)e.getSource();
	if(BP.getText().equals("Click me     ")) {
		hit=hit+1;
		System.out.println("hit="+hit);

	} else {
		speak("You wee ay ah boo egg!");
	}
	
	f.dispose();
	draw();
	
	
	w=w+1;
	System.out.println("w="+w);
	 if(w==10) {
		 endGame(timeAtStart,hit);
	 
	}
}
	
}

