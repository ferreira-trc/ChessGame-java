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

    private void inicialSetUp() {
        board.placePiece(new Rock(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

    }
}
