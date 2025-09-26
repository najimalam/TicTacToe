package models;

import java.util.List;

public class Board {

    private int dimension;
    private List<List<Cell>> board;
    
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    public List<List<Cell>> getBoard() {
        return board;
    }
    public void setGrid(List<List<Cell>> board) {
        this.board = board;
    }

    public void printBoard(){
        for(List<Cell> row : board){
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }
    
}
