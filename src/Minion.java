
public class Minion {
	String name;
	String color;
	String master;
	int eyes;
	
	
 public static void main(String[] args) {

}
 
 public  Minion(String name, int eyes, String color, String master){
	 this.name=name;
	 this.color=color;
	 this.eyes=eyes;
	 this.master=master;
 }
 
 public String getName(){
return name;
	 
 }
 public void setName(String newName){
	 this.name=newName;
	 
 }
 
 public int getEyes(){
	 return eyes;
 }
 
 public void setEyes(int newEyes){
	 this.eyes=newEyes;
 }
 
 public String getColor(){
	 return color;
 }
 
 public void setColor(String newColor){
	 this.color=newColor;
 }
 
 public String getMaster(){
	 return master;
 }
 
 public void setMaster(String newMaster){
	 this.master=newMaster;
 }
 
 
 }

