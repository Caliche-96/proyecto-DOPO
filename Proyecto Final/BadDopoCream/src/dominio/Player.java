package dominio;

import javax.swing.*;

public class Player {

    private int row;
    private int col;
    private ImageIcon sprite;

    public Player(int row, int col) {
        this.row = row;
        this.col = col;
        this.sprite = new ImageIcon("recursos/Vainilla.png");
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public ImageIcon getSprite() { return sprite; }

    public void moveUp(GameBoard board) {
        if (row > 1 && board.isCellFree(row - 1, col))
            row--;
    }

    public void moveDown(GameBoard board) {
        if (row < GameBoard.ROWS - 2 && board.isCellFree(row + 1, col))
            row++;
    }

    public void moveLeft(GameBoard board) {
        if (col > 1 && board.isCellFree(row, col - 1))
            col--;
    }

    public void moveRight(GameBoard board, int maxCols) {
        if (col < maxCols - 2 && board.isCellFree(row, col + 1))
            col++;
    }
}
