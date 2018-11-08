package Rooms;

import Game.Runner;
import People.Person;


public class HealthRoom extends Room
{

    public HealthRoom(int x, int y) {
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
        x.setHealth(100);
        Health = 100;
        System.out.println("You have found full health.");
        System.out.println("Your health is " + Health );

    }


}