package Pieces;

public class Piece {

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

    public void move(){


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
     * @param type
     */
    public void setValue(Type type) {
        switch (type) {
            case PAWN:
                value = 1;
                break;
            case KNIGHT:
            case BISHOP:
                value = 3;
                break;
            case ROOK:
                value = 5;
                break;
            case QUEEN:
                value = 9;
                break;
            case KING:
                value = 999999;
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
