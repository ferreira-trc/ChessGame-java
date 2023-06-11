package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position = null;
        this.board = board;
    }

    public Board getBoard() {
        return this.board;
    }

    public abstract boolean[][] possibleMoves();
    
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getCol()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (mat[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}
