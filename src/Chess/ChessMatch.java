package Chess;

import boardgame.Board;

public class ChessMatch {
    
    private Board board;


    public ChessMatch() {
        board = new Board(8, 8);
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
}
