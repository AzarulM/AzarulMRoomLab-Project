package Rooms;

import People.Person;


public class SomeHealth extends Room
{

    public SomeHealth(int x, int y) {
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
        x.setHealth(this.Health = this.Health + 5);
        Health = Health + 5;
        System.out.println("You have found some health.");
        System.out.println("Your health is " + Health);


        if (Health > 150)
        {
            Health = 150;
            System.out.println("You have max health.");
        }
    }
}
