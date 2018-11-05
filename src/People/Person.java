package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int Health;
	int xLoc, yLoc;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public void setHealth(int Health) {this.Health = Health;}

	public Person (String firstName, String familyName, int xLoc, int yLoc, int Health)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Health = Health;
	}


}
