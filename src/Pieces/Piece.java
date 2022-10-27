package Pieces;

import Board.*;

public class Piece {
    //TODO: extend Piece class to each individual piece (20.12.2020)

    //TODO: Add subclasses for each piece (Queen extends Piece etc) (26.10.2022)
    //Variables
    private int value;
    private Color color;
    private Type type;

    //Constructor
    public Piece(Color color, Type type) {

        setValue(type);
        setColor(color);
        setType(type);
    }

    public void move(int deltaX, int deltaY){


        //TODO: finish this method (20.12.2020)
        //TODO: add getPiece to "Tile" (23.05.2022)

    }

    /**
     * This method gives a console output.
     * Prints color and type of piece.
     */
    public void printPiece() {
        System.out.print(getColor() + " ");
        System.out.print(getType());
    }


    //Getter & Setter
    public int getValue() {
        return value;
    }

    /** Defining piece values for each specific type, according to chess rules.
     *
     * @param type - Piece to be selected
     */
    public void setValue(Type type) {
        switch (type) {
            case PAWN -> value = 1;
            case KNIGHT, BISHOP -> value = 3;
            case ROOK -> value = 5;
            case QUEEN -> value = 9;
            case KING -> value = 696969;
        }
    }


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
