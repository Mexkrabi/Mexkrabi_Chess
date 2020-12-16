import Board.*;
import CustomExceptions.*;
import Logic.*;
import Pieces.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GameLogic gameLogic = new GameLogic();
        Board board = new Board(gameLogic);

        //TODO: put all outputs in {}-brackets (16.12.2020)
    //---------------------------------------------------------------------------

        //Adding pieces to the corresponding starting positions
        int x;
        int y;
        int pieceNr; //indicates which piece should be selected

        //white
        pieceNr = 0;

        //Pawns
        //Coords. A1-A8, array pos. 0-7
        for(int i = 0; i < board.size; i++) {
            for(int j = 0; j < board.size; j++) {

                if( board.tiles[i][j].getX_pos() == 1) { //selects A-line
                    try {
                        board.tiles[i][j].addPiece(board.whitePieces[pieceNr]);
                        {
                            System.out.print("Piece added to: ");
                            board.tiles[i][j].printCoordinates();
                            System.out.print(" ");
                            board.whitePieces[pieceNr].printPiece();
                            System.out.println();
                        } //output
                        pieceNr++; //
                    } catch (FullTileException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //TODO: Add remaining white pieces (all except PAWNs) (16.12.2020)

        //black
        pieceNr = 0;

        //Pawns
        //Coords. H1-H8, array pos. 0-7
        for(int i = 0; i < board.size; i++) {
            for(int j = 0; j < board.size; j++) {

                if( board.tiles[i][j].getX_pos() == 8) { //selects H-line
                    try {
                        board.tiles[i][j].addPiece(board.blackPieces[pieceNr]);
                        {
                            System.out.print("Piece added to: ");
                            board.tiles[i][j].printCoordinates();
                            System.out.print(" ");
                            board.blackPieces[pieceNr].printPiece();
                            System.out.println();
                        } //output
                        pieceNr++; //
                    } catch (FullTileException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //TODO: Add remaining black pieces (all except PAWNs) (16.12.2020)

        //board.tiles[x-1][y-1].getY_pos();

    //---------------------------------------------------------------------------

        //Testing
/*
        try {
            board.tiles[0][0].addPiece(board.whitePieces[0]);
        } catch (FullTileException e) {
            e.printStackTrace();
        }
*/
        System.out.println("End");

    }
}
