
public class Athlete {
	String name;
	int speed;
	int bib;
	static int count;
	static String location="Colarado";
	static int start=3;
public static void main(String[] args) {
	Athlete logan = new Athlete("logan",50);
	Athlete lucius = new Athlete("lucius", 100);
	Athlete nick = new Athlete("nick", 75);
	
	System.out.println(logan.getName());
	System.out.println(logan.getBib());
	
	System.out.println(lucius.getName());
	System.out.println(lucius.getBib());
	
	System.out.println(nick.getName());
	System.out.println(nick.getBib());
	
    System.out.println(location);
    System.out.println(start);
    
    System.out.println("new");
    
    location="Torry Pines";
    start=4;
    
    System.out.println(location);
    System.out.println(start);
    
    logan.location="La Jolla";
    
    System.out.println(logan.location);
    
    System.out.println(logan.name);
    System.out.println(logan.location);
    
    System.out.println(lucius.name);
    System.out.println(lucius.location);
    
    System.out.println(nick.name);
    System.out.println(nick.location);
    
    
}
public Athlete(String name, int speed){
	this.name=name;
	this.name=name;
count=count+1;
bib=count;

}

public String getName(){
	return this.name;
}

public int getBib(){
	return this.bib;
}
}
