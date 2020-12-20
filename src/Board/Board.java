package Board;

import CustomExceptions.*;
import Logic.*;
import Pieces.*;

public class Board {

    //Variables
    public static final int size = 8; //Defines the size of the playing board
    public static Tile[][] tiles; //Tiles are saved in a 2D-Array
    public static Piece[] whitePieces = new Piece[16]; //Array containing all white pieces
    public static Piece[] blackPieces = new Piece[16]; //Array containing all black pieces

    //Constructor
    public Board(GameLogic g) {

        try {
            generateTiles(g.startOfTheGame);
            whitePieces = generateWhitePieces(g.startOfTheGame);
            blackPieces = generateBlackPieces(g.startOfTheGame);
        } catch (NotStartOfTheGameException e) {
            e.printStackTrace();
        }
        //TODO: startOfTheGame = false;
    }

    //Methods

    /**
     * Method for generating all Tiles at the start of the game.
     *
     * @param isStartOfTheGame - global value found in class 'GameLogic'
     * @throws NotStartOfTheGameException - Indicates that it is not the start of a new game, therefore new tiles are not generated
     */
    private void generateTiles(boolean isStartOfTheGame) throws NotStartOfTheGameException {

        if (isStartOfTheGame) {
            tiles = new Tile[size][size]; //Array containing all tiles is generated

            //filling the array with new tiles
            //also, tile creation
            for (int i = 0; i < 8; i++) {
                System.out.print("Tiles XY: ");
                for (int j = 0; j < 8; j++) {
                    tiles[i][j] = new Tile(i + 1, j + 1);
                    tiles[i][j].printCoordinates();
                    System.out.print(" - ");
                }
                System.out.println();
            }
        } else throw new NotStartOfTheGameException("It is not the start of the game.");
    }

    /**
     * Method for generating white figures
     *
     * @param isStartOfTheGame - global value found in class 'GameLogic'
     * @return Piece[] array containing all 16 white pieces
     * @throws NotStartOfTheGameException - Indicates that it is not the start of a new game, therefore does not generate new white pieces
     */
    private Piece[] generateWhitePieces(boolean isStartOfTheGame) throws NotStartOfTheGameException {

        System.out.println("-----------------------------------------------");
        if (isStartOfTheGame) {

            System.out.println("Creating white pieces:");

            Piece[] whitePieces = new Piece[16];
            int n = 0;
            Color c = Color.WHITE;

            //PAWN
            while (n < 8) {
                whitePieces[n] = new Piece(c, Type.PAWN);
                System.out.print("successfully added ");    //output
                whitePieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //KNIGHT
            while (n < 10) {
                whitePieces[n] = new Piece(c, Type.KNIGHT);
                System.out.print("successfully added ");    //output
                whitePieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //BISHOP
            while (n < 12) {
                whitePieces[n] = new Piece(c, Type.BISHOP);
                System.out.print("successfully added ");    //output
                whitePieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //ROOK
            while (n < 14) {
                whitePieces[n] = new Piece(c, Type.ROOK);
                System.out.print("successfully added ");    //output
                whitePieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //QUEEN
            whitePieces[n] = new Piece(c, Type.QUEEN);
            System.out.print("successfully added ");    //output
            whitePieces[n].printPiece();                //output
            System.out.println();                       //output
            n++;
            //KING
            whitePieces[n] = new Piece(c, Type.KING);
            System.out.print("successfully added ");    //output
            whitePieces[n].printPiece();                //output
            System.out.println();                       //output

            return whitePieces;
        }
        else throw new NotStartOfTheGameException("It is not the start of the game.");
    }

    /** Method for generating black figures
     *
     * @param isStartOfTheGame - global value found in class 'GameLogic'
     * @return Piece[] array containing all 16 black pieces
     * @throws NotStartOfTheGameException - Indicates that it is not the start of a new game, therefore does not generate new black pieces
     */
    private Piece[] generateBlackPieces(boolean isStartOfTheGame) throws NotStartOfTheGameException {

        System.out.println("-----------------------------------------------");
        if (isStartOfTheGame) {

            System.out.println("Creating black pieces:");

            Piece[] blackPieces = new Piece[16];
            int n = 0;
            Color c = Color.BLACK;

            //PAWN
            while (n < 8) {
                blackPieces[n] = new Piece(c, Type.PAWN);
                System.out.print("successfully added ");    //output
                blackPieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //KNIGHT
            while (n < 10) {
                blackPieces[n] = new Piece(c, Type.KNIGHT);
                System.out.print("successfully added ");    //output
                blackPieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //BISHOP
            while (n < 12) {
                blackPieces[n] = new Piece(c, Type.BISHOP);
                System.out.print("successfully added ");    //output
                blackPieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //ROOK
            while (n < 14) {
                blackPieces[n] = new Piece(c, Type.ROOK);
                System.out.print("successfully added ");    //output
                blackPieces[n].printPiece();                //output
                System.out.println();                       //output
                n++;
            }
            //QUEEN
            blackPieces[n] = new Piece(c, Type.QUEEN);
            System.out.print("successfully added ");    //output
            blackPieces[n].printPiece();                //output
            System.out.println();                       //output
            n++;
            //KING
            blackPieces[n] = new Piece(c, Type.KING);
            System.out.print("successfully added ");    //output
            blackPieces[n].printPiece();                //output
            System.out.println();                       //output
            return blackPieces;
        }
        else throw new NotStartOfTheGameException("It is not the start of the game.");
    }
}
