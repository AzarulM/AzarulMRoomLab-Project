package Rooms;

import Game.Runner;
import People.Person;

public class EscapeRoom extends Room
{

	public EscapeRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have found the exit! You are now free!.");
		Runner.gameOff();
	}
	

}
