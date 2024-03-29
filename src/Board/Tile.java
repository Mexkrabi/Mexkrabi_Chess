package Board;

import CustomExceptions.*;
import Pieces.*;

public class Tile {

    //Variables
    private int x_pos; //x coordinate aka. A,B,C,...,H
    private int y_pos; //y coordinate aka. 1,2,3,...,8
    private Piece piece;

    //Constructor

    /** Constructor for class Tile
     *
     * @param x_pos - x coordinate aka. A,B,C,...,H
     * @param y_pos - y coordinate aka. 1,2,3,...,8
     */
    public Tile(int x_pos, int y_pos) {
        setX_pos(x_pos);
        setY_pos(y_pos);
        piece = null;
    }

    //Methods

    /** Checks if the current tile has a piece on it and gives a feedback respectively.
     *
     * @return true = is empty --> has NO piece on it
     *         false = is NOT empty --> has a piece on it
     */
    public boolean isEmpty() {

        return piece == null; //if(piece != null) return true; else return false;
    }

    /** Adds a piece to the tile, if said tile does not already have another piece.
     *  Requires a try-catch block.
     *
     * @param piece - Piece that is supposed to go to this tile
     * @throws FullTileException - self-explanatory (Tile already has a piece)
     */
    public void addPiece(Piece piece) throws FullTileException {
        if(isEmpty()) {
            this.piece = piece;
        } else {
            //Custom Exception
            throw new FullTileException("Tile is already used by another piece! There can only be one piece at a time.");
        }
    }

    /**
     * This method gives a console output.
     * Prints X and Y coordinates.
     */
    public void printCoordinates() {

        switch (getX_pos()) {
            case 1 -> System.out.print('A');
            case 2 -> System.out.print('B');
            case 3 -> System.out.print('C');
            case 4 -> System.out.print('D');
            case 5 -> System.out.print('E');
            case 6 -> System.out.print('F');
            case 7 -> System.out.print('G');
            case 8 -> System.out.print('H');
        }
        System.out.print(getY_pos());
    }

    //Getter & Setter
    public int getX_pos() {
        return x_pos;
    }

    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}