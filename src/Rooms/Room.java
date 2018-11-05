package Rooms;

import Game.Runner;
import People.Person;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	int Health;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
		Health = 100;
	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You have entered an unknown part of the house.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.setHealth(this.Health);

		if (Health == 0)
		{
			System.out.println("You lost all your health.");
			Runner.gameOff();
		}
		else if (Health > 150)
		{
			Health = 150;
			System.out.println("You have max health.");
		}
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
