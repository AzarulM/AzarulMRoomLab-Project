package Game;

import People.Person;
import Rooms.Room;
import Rooms.EscapeRoom;
import Rooms.GhostRoom;
import Rooms.HealthRoom;
import Rooms.DeathRoom;
import Rooms.SomeHealth;

import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{

		System.out.println("You have enterd an unknown house. The door behind you closes and it is dark. You hear random noises. Try to find the exit without DYING!!!");
		Scanner in = new Scanner(System.in);
		Board layout = new Board(10,10);
		Room[][] building = layout.Formation();
		layout.PlaySpace();
		
		//Create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new EscapeRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new GhostRoom(x,y);



		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new HealthRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new DeathRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new SomeHealth(x, y);





		 
		 //Setup player 1 and the input scanner
		System.out.println("What's your first name?");
		String firstName = in.nextLine();
		System.out.println("Last name?");
		String lastName = in.nextLine();
		Person player1 = new Person(firstName, lastName, 0,0, 100);
		System.out.println("Welcome " + firstName + " " + lastName);
		System.out.println("Now choose a direction");
		building[0][0].enterRoom(player1);
		while(gameOn)
		{
			System.out.println("Where would you like to move now? (Choose W to move foward, Choose S to move back, Choose A to move left, Choose D to move right. )");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
			}
			else {
				System.out.println("You are in front of a wall. Choose another direction..");
			}


		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}


	public static void gameOff()
	{
		gameOn = false;
	}
	


}
