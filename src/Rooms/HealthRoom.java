package Rooms;

import Game.Runner;
import People.Person;
import Rooms.Room;


public class HealthRoom extends Room
{

    public HealthRoom(int x, int y) {
        super(x, y);
        this.Health = Health;
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
        System.out.println("You have found health.");
        Health = 100;
        System.out.println("Your health is " + Health );

    }


}