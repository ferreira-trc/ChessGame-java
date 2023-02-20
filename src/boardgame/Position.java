package boardgame;
public class Position {
    
    private int row;
    private int col;   

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }      

    /**
     * @return int return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return int return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return getRow() + "," + getCol();
    }

}
