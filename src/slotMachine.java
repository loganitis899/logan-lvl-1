import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel r1 = new JLabel();
JLabel r2 = new JLabel();
JLabel r3 = new JLabel();
JButton s = new JButton();
JLabel w = new JLabel();
	
	public static void main(String[] args) {
		slotMachine slot = new slotMachine();
		slot.run();
		
	}
	public void run() {
		Random rand = new Random();
		int s1 = rand.nextInt(6);
		Random randy = new Random();
		int s2 = randy.nextInt(6);
		Random brandy = new Random();
		int s3 = brandy.nextInt(6);
		f.setVisible(true);
		f.add(p);
		p.add(r1);
		p.add(r2);
		p.add(r3);
		p.add(s);
		p.add(w);
		s.setText("SPIN!!");
		s.addActionListener(this);
		String sr1 = Integer.toString(s1);
		String sr2 = Integer.toString(s2);
		String sr3 = Integer.toString(s3);
		r1.setText(sr1);
		r2.setText(sr2);
		r3.setText(sr3);
		f.pack();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		int s1 = rand.nextInt(3);
		Random randy = new Random();
		int s2 = randy.nextInt(3);
		Random brandy = new Random();
		int s3 = brandy.nextInt(3);

		String sr1 = Integer.toString(s1);
		String sr2 = Integer.toString(s2);
		String sr3 = Integer.toString(s3);
		r1.setText(sr1);
		r2.setText(sr2);
		r3.setText(sr3);
		
		if(s1 == s2&&s1==s3&&s2==s3) {
			w.setText("You ween!");
			f.pack();
		} else {
			w.setText("Yue Luse!");
			f.pack();
		}
		
	}
}
