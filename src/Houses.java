import org.jointheleague.graphical.robot.Robot;

public class Houses {
	int size;
	public static void main(String[] args) {
		Robot jeff = new Robot();
		Houses house = new Houses();
		jeff.setX(50);
		jeff.setY(800);
		jeff.setSpeed(5000);
	
		house.makeHouse2(jeff, 10);
		house.makeHouse2(jeff, 20);
		house.makeHouse2(jeff, 640);
		house.makeHouse2(jeff, 60);
		house.makeHouse2(jeff, 800);
		house.makeHouse2(jeff, 460);
		house.makeHouse2(jeff, 10);
		house.makeHouse2(jeff, 70);
		house.makeHouse2(jeff, 60);
		
		
		
	}
	public void makeHouse2(Robot name, int height){
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
