package Rooms;

import People.Person;


public class GhostRoom extends Room
{

    public GhostRoom(int x, int y) {
        super(x, y);
        this.Health = Health;
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
        System.out.println("You have been attacked by a ghost.");
        Health = Health - 10;
        System.out.println("Your health is " + Health );
    }


}
