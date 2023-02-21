package Chess;

import Chess.pieces.King;
import Chess.pieces.Rock;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
    
    private Board board;


    public ChessMatch() {
        board = new Board(8, 8);
        inicialSetUp();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getColumns(); col++) {
                mat[row][col] = (ChessPiece) board.piece(row, col);
            }            
        }

        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void inicialSetUp() {
        placeNewPiece('b', 6, new Rock(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));

    }
}
