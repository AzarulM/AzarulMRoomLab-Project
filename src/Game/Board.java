package Game;

import Rooms.Room;
import Rooms.EscapeRoom;


public class Board {
    static int height;
    static int width;
    public static String[][] mapForm;
    public static String[][] mapBorder;


    public Board(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static Room[][] Formation() {
        Room[][] building = new Room[height][width];

        for (int i = 0; i < building.length; i++) {
            for (int j = 0; j < building[i].length; j++) {
                building[i][j] = new Room(i, j);
            }
        }

        int x = (int) (Math.random() * building.length);
        int y = (int) (Math.random() * building.length);
        building[x][y] = new EscapeRoom(x, y);

        return building;
    }

    public static void PlaySpace() {
        mapForm = new String[height][width];
        mapBorder = new String[height][width];
        for (int i = 0; i < mapForm.length; i++) {
            for (int j = 0; j < mapForm[i].length; j++) {
                mapForm[i][j] = "[";
            }
        }
    }
}