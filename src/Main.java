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
        int pieceNr; //indicates which piece should be selected

//white
        pieceNr = 0;

        //Pawns
        //Coords. B1-B8; array pos. 0-7
        for(int i = 0; i < board.size; i++) {
            for(int j = 0; j < board.size; j++) {

                if( board.tiles[i][j].getX_pos() == 2) { //selects B-line
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

        //Knights
        //Coords. A2, A7; array pos. 8-9
        try {
            board.tiles[1-1][2-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][2-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[1-1][7-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][7-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;


        //Bishops
        //Coords. A3, A6; array pos. 10-11
        try {
            board.tiles[1-1][3-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][3-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[1-1][6-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][6-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //Rook
        //Coords. A1, A8; array pos. 12-13
        try {
            board.tiles[1-1][1-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][1-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[1-1][8-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][8-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //Queen
        //Coords. A4; array pos. 14
        try {
            board.tiles[1-1][4-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][4-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //King
        //Coords. A5; array pos. 15
        try {
            board.tiles[1-1][5-1].addPiece(board.whitePieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[1-1][5-1].printCoordinates();
                System.out.print(" ");
                board.whitePieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }

//black
        pieceNr = 0;

        //Pawns
        //Coords. G1-G8, array pos. 0-7
        for(int i = 0; i < board.size; i++) {
            for(int j = 0; j < board.size; j++) {

                if( board.tiles[i][j].getX_pos() == 7) { //selects G-line
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

        //Knights
        //Coords. H2, H7; array pos. 8-9
        try {
            board.tiles[8-1][2-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][2-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[8-1][7-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][7-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;


        //Bishops
        //Coords. H3, H6; array pos. 10-11
        try {
            board.tiles[8-1][3-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][3-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[8-1][6-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][6-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //Rook
        //Coords. H1, H8; array pos. 12-13
        try {
            board.tiles[8-1][1-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][1-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;
        try {
            board.tiles[8-1][8-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][8-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //Queen
        //Coords. H4; array pos. 14
        try {
            board.tiles[8-1][4-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][4-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }
        pieceNr++;

        //King
        //Coords. H5; array pos. 15
        try {
            board.tiles[8-1][5-1].addPiece(board.blackPieces[pieceNr]);
            {
                System.out.print("Piece added to: ");
                board.tiles[8-1][5-1].printCoordinates();
                System.out.print(" ");
                board.blackPieces[pieceNr].printPiece();
                System.out.println();
            } //output
        } catch (FullTileException e) {
            e.printStackTrace();
        }

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
