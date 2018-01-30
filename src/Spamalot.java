import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
JTextField jt = new JTextField(15);
static final String FAKE_USERNAME = "uneverknow1234567@gmail.com";
static final String FAKE_PASSWORD = "nagol123";


public static void main(String[] args) {
	Spamalot run = new Spamalot();
	run.run();
	
	
}

public void run() {
	f.setVisible(true);
	
	f.add(p);
	
	p.add(jt);
	p.add(b1);
	p.add(b2);
	
	b1.setText("gOod");
	b2.setText("bAD");
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	f.pack();


}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	String jtext = jt.getText();
	for(int i=0; i<40; i++) {
	sendSpam(jtext, "its me",  "i t0lD u sO");
	}
}


}
