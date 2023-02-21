package Chess;

import boardgame.Position;

public class ChessPosition {
    
    private char column;
    private int row;
    
    public ChessPosition(char column, int row) {

        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPossition. Valid values are from a1 to h8.");
        }

        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }    

    public char getColumn() {
        return this.column;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getCol()), (char) (8 - position.getRow()));
    }

   


}
