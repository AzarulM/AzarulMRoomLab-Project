package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class DeathRoom extends Room {

    public DeathRoom(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     *
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have been attacked by multiple ghosts.");
        System.out.println("You have died.");
        Runner.gameOff();

    }

}
