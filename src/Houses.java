import org.jointheleague.graphical.robot.Robot;

public class Houses {
	int size;
	public static void main(String[] args) {
		Robot jeff = new Robot();
		Houses house = new Houses();
		jeff.setX(50);
		jeff.setY(800);
		jeff.setSpeed(5000);
		
		house.makePointyHouse(jeff, 100, 0, 200, 0);
	    house.makeFlatHouse(jeff, 160, 250, 29, 100);
		
		
		
	}
	public void makePointyHouse(Robot name, int height, int r, int b, int g) {
		name.setPenColor(r, g, b);
		name.move(height);
		name.turn(45);
		name.move(30);
		name.turn(90);
		name.move(30);
		name.turn(45);
		name.move(height);
		name.turn(-90);
		name.move(50);
		name.turn(-90);
		
	}
	
	public void makeFlatHouse(Robot name, int height, int r, int b, int g){
		name.setPenColor(r, g, b);
		name.move(height);
		name.turn(90);
		name.move(20);
		name.turn(90);
		name.move(height);
		name.turn(-90);
		name.move(50);
		name.turn(-90);
		
	}
	
	public void makeHouse(Robot name) {
		
		name.move(100);
		name.turn(90);
		name.move(20);
		name.turn(90);
		name.move(100);
		name.turn(-90);
		name.move(50);
		name.turn(-90);
		
		
		

}
	public void makeTenHouses(Robot name){
		for(int i=0; i<10; i++){
			name.move(100);
			name.turn(90);
			name.move(20);
			name.turn(90);
			name.move(100);
			name.turn(-90);
			name.move(50);
			name.turn(-90);
		}
	}
}
