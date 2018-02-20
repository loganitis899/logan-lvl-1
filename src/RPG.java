import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RPG implements ActionListener {
	JFrame F=new JFrame();
	JPanel P=new JPanel();
	JLabel Hero=new JLabel();
	JLabel Dragon=new JLabel();
	JLabel HHP=new JLabel();
	JLabel DHP= new JLabel();
	JButton Attack = new JButton();
	int HealthH=100;
	int HealthD=100;
	
	
	public static void main(String[] args) {
		RPG run = new RPG();
		run.run();
		
	}
 
	void run() {
		Hero=loadImageFromComputer("dragon.jpg");
		Dragon=loadImageFromComputer("hero.jpg");
		F.setVisible(true);
		F.add(P);
		P.add(Dragon);
		P.add(Hero);
		P.add(HHP);
		P.add(DHP);
		P.add(Attack);
		
		Attack.addActionListener(this);
		String HealthHH = Integer.toString(HealthH);
		String HealthDD = Integer.toString(HealthD);
		HHP.setText(HealthHH);
		DHP.setText(HealthDD);
		Attack.setText("Attack Enemy");
		;
		
		
		
		F.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		int damage = rand.nextInt(10) + 1;
		HealthH-=damage;
		HHP.setText(HealthH + "");
		
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL=getClass().getResource(fileName);
		Icon icon=new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
