package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		 World world = new World();
		 Bug DonaldTrumb = new Bug();
		 Bug nOTDonaldTrumb = new Bug();
		 Location loc = new Location(4, 5);
		 world.show();
		 world.add(loc, DonaldTrumb);
		 Location loc2 = new Location(5, 2);
		 nOTDonaldTrumb.setColor(Color.blue);
		 nOTDonaldTrumb.setDirection(90);
		 world.add(loc2, nOTDonaldTrumb);
		 
		 
		
		
		
		
		
	}
}
