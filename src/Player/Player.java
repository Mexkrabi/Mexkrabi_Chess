package Player;

import Pieces.Color;

public class Player {

    private Color playercolor;
    private int nr;
    private int points;



    //Constructor
    public Player(int nr, Color color) {

        this.nr = nr;
        this.playercolor = color;
        points = 0;

    }
}
