package Rooms;

import Game.Runner;
import People.Person;


public class GhostRoom extends Room
{

    public GhostRoom(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(this.Health = this.Health - 10);
        Health = Health - 10;
        System.out.println("You have been attacked by a ghost.");
        System.out.println("Your health is " + Health );

        if (Health == 0)
        {
            System.out.println("You lost all your health.");
            Runner.gameOff();
        }
    }


}
