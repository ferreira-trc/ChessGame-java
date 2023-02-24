package Chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Board board,Color color) {
        super(board);
        this.color = color;
    }    

    public Color getColor() {
        return this.color;
    }

    protected boolean isThereOpponentPiece(Position Position) {
        ChessPiece p = (ChessPiece)getBoard().piece(Position);
        return p != null && p.getColor() != color;
    }

}
