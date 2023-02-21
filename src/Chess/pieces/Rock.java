package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rock extends ChessPiece {

    public Rock(Board board, Color color) {
        super(board, color);        
    }
    

    @Override
    public String toString() {
        return "R";
    }

    
}
