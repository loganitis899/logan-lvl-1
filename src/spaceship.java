
public class spaceship {
	
String pilot;
String name;
int fuel;
public spaceship(String pilot, String name){
	this.pilot = pilot;
	this.name = name;
	
}

 void refuel(){
	 fuel=300;
	 System.out.println("refueling to 300 fuel");
 }
 
 void launch(){
	 if(fuel>150){
		 fuel=fuel-150;
		 System.out.println("launching! fuel is now at "+ fuel);
	 }else{
		 System.out.println(name+" doesnt have enough fuel to launch!!");
	 }
	
	 
	 
 }
 
 void info(){
	 System.out.println("this spaceship is called "+name+" and is piloted by "+pilot+". This ship has "+fuel+" fuel");
 }

}
