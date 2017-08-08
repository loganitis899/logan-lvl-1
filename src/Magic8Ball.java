

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public  void getMagic(){
	int random = new Random().nextInt(4);
	System.out.println(random);
	String question = JOptionPane.showInputDialog("ask away");
    if(random==0){
  JOptionPane.showMessageDialog(null, "yes.");
    } else if(random==1){
    	JOptionPane.showMessageDialog(null, "NO.");
    } else if(random==2){
    	JOptionPane.showMessageDialog(null, "ask guugle!");
    }else if(random==3){
    	JOptionPane.showMessageDialog(null, "if it is wednesday, the answer is yes. otherwise, maybe.");
    }
}
	

}

