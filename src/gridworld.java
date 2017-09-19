import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
	public static void main(String[] args) {
		
		int  n =new Random().nextInt(6);
		int  l =new Random().nextInt(6);
		int k = 270;
		World world = new World();
		Bug bug = new Bug();
		Bug randy = new Bug();
		Flower flower = new Flower();
		Flower power = new Flower();
		Location location = new Location(2, 5);
		Location blocation = new Location(3, 5);
		Location flocation = new Location(1, 5);
		Location velcroation = new Location(n,l);
		
		world.add(location, bug);
		world.add(blocation, flower);
		world.add(flocation, power);
		world.add(velcroation, randy);
		
		world.show();
		bug.setColor(Color.BLUE);
		bug.setDirection(k);
		
		int q=0;
		int w=0;
		for(int j=0; j<10; j++) {
			for(int h=0; h<10;h++) {
				Location knew = new Location(q,w);
				Flower cover = new Flower();
				world.add(knew, cover);
				q=q+1;
				if(q==10) {
					q=0;
					w=w+1;
				}
			}
		}
			
			
		

		
	}
	

}
