package boardgame;
public class Position {
    
    private int row;
    private int col;   

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }      


    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }
 
    public void setValues(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return getRow() + "," + getCol();
    }

}
