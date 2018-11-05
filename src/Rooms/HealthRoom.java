package Rooms;

import People.Person;


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
        System.out.println("You have found some health.");
        Health = Health + 5;
        System.out.println("Your health is " + Health );

    }


}